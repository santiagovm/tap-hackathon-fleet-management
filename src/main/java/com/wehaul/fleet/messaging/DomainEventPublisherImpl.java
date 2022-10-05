package com.wehaul.fleet.messaging;

import com.wehaul.fleet.domain.DomainEventPublisher;
import com.wehaul.fleet.domain.TruckAvailabilityChanged;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DomainEventPublisherImpl implements DomainEventPublisher {
    public void publish(TruckAvailabilityChanged truckAvailabilityChanged) {
        log.info("here is where Alfus and Erik come in, event published. TruckId: [{}] Available: [{}]",
                truckAvailabilityChanged.getTruckId(), truckAvailabilityChanged.isAvailable());
    }
}
