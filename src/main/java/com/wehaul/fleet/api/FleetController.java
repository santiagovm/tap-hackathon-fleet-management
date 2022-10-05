package com.wehaul.fleet.api;

import com.wehaul.fleet.domain.FleetService;
import com.wehaul.fleet.domain.NewTruck;
import com.wehaul.fleet.domain.Truck;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@OpenAPIDefinition(
        info = @Info(
                title = "Fleet Management API",
                version = "1.0"
        ),
        tags = @Tag(name = "Fleet REST API"))
@CrossOrigin
@RestController
@RequestMapping("/api/fleet")
@RequiredArgsConstructor
public class FleetController {

    private final FleetService fleetService;

    @Operation(summary = "Creates a new truck in the fleet.", method = "POST", tags = "truck")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "Truck successfully saved.",
                    headers = @Header(
                            name = "Location",
                            description = "Contains path which can be used to retrieve saved truck. Last element is it's ID.",
                            required = true,
                            schema = @Schema(type = "string")
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Truck data is invalid."
            )
    })
    @PostMapping("/trucks")
    ResponseEntity<Void> create(@Valid @RequestBody TruckCreateRequest request) {

        NewTruck newTruck = fromRequest(request);
        Truck createdTruck = fleetService.addTruck(newTruck);
        URI locationUri = toLocationUri(createdTruck.getTruckId());
        return ResponseEntity.created(locationUri).build();
    }

    private NewTruck fromRequest(TruckCreateRequest request) {
        return new NewTruck(request.miles());
    }

    private URI toLocationUri(int id) {
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
    }
}
