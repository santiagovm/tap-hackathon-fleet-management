package com.wehaul.fleet.api;

import com.wehaul.fleet.domain.Truck;
import com.wehaul.fleet.messaging.NotificationService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@OpenAPIDefinition(
        info = @Info(
                title = "Fleet Management API",
                version = "1.0"),
        tags = @Tag(
                name = "Fleet Management REST API"))
@CrossOrigin
@RestController
@RequestMapping("/api/fleet-management")
class FleetManagementController {

    private final NotificationService notificationService;

    FleetManagementController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("")
    ResponseEntity<Void> buyTruck() {
        Truck truck = new Truck(UUID.randomUUID(), "bought");
        notificationService.notifyAvailability(truck);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}