package com.wehaul.fleet.messaging;

import com.wehaul.fleet.domain.Truck;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public record NotificationService(StreamBridge streamBridge) {

    public void notifyAvailability(Truck truck) {
        streamBridge.send("available", truck);
    }

    @Bean
    public Consumer<Truck> availableReceived() {
        return truck -> log.info("Received: {}", truck);
    }

}
