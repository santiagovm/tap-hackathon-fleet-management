package com.wehaul.fleet.domain;

import com.wehaul.fleet.data.TruckRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FleetService {

    private final TruckRepository truckRepo;
    private final DomainEventPublisher domainEventPublisher;

    public Truck addTruck(NewTruck newTruck) {

        Truck truck = Truck.builder()
                .miles(newTruck.miles())
                .lastInspectionMiles(0)
                .available(true)
                .availabilityReason("new truck")
                .build();

        // save to database
        Truck savedTruck = truckRepo.create(truck);
        log.info(" >>> truck saved to database: [{}]", savedTruck);

        // publish event
        TruckAvailabilityChanged truckAvailabilityChanged = TruckAvailabilityChanged.builder()
                .truckId(savedTruck.getTruckId())
                .available(true)
                .build();

        domainEventPublisher.publish(truckAvailabilityChanged);
        log.info(" >>> truck available event published [{}]", truckAvailabilityChanged);

        return savedTruck;
    }

    public List<Truck> getTrucks() {
        return truckRepo.findAll();
    }
}
