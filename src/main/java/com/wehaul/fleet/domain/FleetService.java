package com.wehaul.fleet.domain;

import com.wehaul.fleet.data.TruckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
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

        // publish event
        TruckAvailabilityChanged truckAvailabilityChanged = TruckAvailabilityChanged.builder()
                .truckId(savedTruck.getTruckId())
                .available(true)
                .build();

        domainEventPublisher.publish(truckAvailabilityChanged);

        return savedTruck;
    }
}
