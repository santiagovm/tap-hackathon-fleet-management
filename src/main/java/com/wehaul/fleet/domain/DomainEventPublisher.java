package com.wehaul.fleet.domain;

public interface DomainEventPublisher {

    void publish(TruckAvailabilityChanged truckAvailabilityChanged);

}
