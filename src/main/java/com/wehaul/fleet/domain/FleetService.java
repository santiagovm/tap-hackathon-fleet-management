package com.wehaul.fleet.domain;

import com.wehaul.fleet.data.TruckRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class FleetService {

    private final TruckRepository truckRepo;
    private final DomainEventPublisher domainEventPublisher;

    public Truck addTruck(NewTruck newTruck) {

        if (newTruck.miles() <  0) {
            throw new RuntimeException("miles must 0 or greater");
        }

        Truck truck = Truck.builder()
                .miles(newTruck.miles())
                .lastInspectionMiles(0)
                .available(true)
                .availabilityReason("new truck")
                .build();

        // save to database
        Truck savedTruck = truckRepo.create(truck);
        log.info(" >>> truck saved to database: [{}]", savedTruck);

        publishAvailability(savedTruck.getTruckId(), true);

        return savedTruck;
    }

    public List<Truck> getTrucks() {
        return truckRepo.findAll();
    }

    public void sendTruckForInspection(int truckId) {

        // throw if truck not available
        Optional<Truck> truckOptional = truckRepo.findById(truckId);
        Truck truck = truckOptional.orElseThrow(() -> new RuntimeException("truck not found"));

        if (!truck.getAvailable()) {
            throw new RuntimeException("truck is not available: [" + truck.getAvailabilityReason() + "]");
        }

        // save to database
        truck.setAvailable(false);
        truck.setAvailabilityReason("sent for inspection");
        truckRepo.update(truck);
        log.info(" >>> truck saved to database: [{}]", truck);

        publishAvailability(truckId, false);
    }

    public void returnTruckFromInspection(int truckId) {
        Optional<Truck> truckOptional = truckRepo.findById(truckId);
        Truck truck = truckOptional.orElseThrow(() -> new RuntimeException("truck not found"));

        if (truck.getAvailable()) {
            log.info("truck is already available: [{}]", truck);
            return;
        }

        truck.setAvailable(true);
        truck.setAvailabilityReason("returned from inspection");

        truckRepo.update(truck);
        log.info(" >>> truck saved to database: [{}]", truck);

        publishAvailability(truckId, true);
    }

    public void claimTruck(int truckId, String claimDetails) {

        // todo: refactor this, duplicate code

        // throw if truck not available
        Optional<Truck> truckOptional = truckRepo.findById(truckId);
        Truck truck = truckOptional.orElseThrow(() -> new RuntimeException("truck not found"));

        if (!truck.getAvailable()) {
            throw new RuntimeException("truck is not available: [" + truck.getAvailabilityReason() + "]");
        }

        // save to database
        truck.setAvailable(false);
        truck.setAvailabilityReason(claimDetails);
        truckRepo.update(truck);
        log.info(" >>> truck saved to database: [{}]", truck);

        publishAvailability(truckId, false);
    }

    public void releaseTruck(int truckId, String releaseDetails) {

        // todo: refactor this, duplicate code

        Optional<Truck> truckOptional = truckRepo.findById(truckId);
        Truck truck = truckOptional.orElseThrow(() -> new RuntimeException("truck not found"));

        if (truck.getAvailable()) {
            log.info("truck is already available: [{}]", truck);
            return;
        }

        truck.setAvailable(true);
        truck.setAvailabilityReason(releaseDetails);

        truckRepo.update(truck);
        log.info(" >>> truck saved to database: [{}]", truck);

        publishAvailability(truckId, true);
    }

    private void publishAvailability(int truckId, boolean available) {

        TruckAvailabilityChanged availabilityChanged = TruckAvailabilityChanged.builder()
                .truckId(truckId)
                .available(available)
                .build();

        domainEventPublisher.publish(availabilityChanged);
        log.info(" >>> truck availability event published [{}]", availabilityChanged);
    }


}
