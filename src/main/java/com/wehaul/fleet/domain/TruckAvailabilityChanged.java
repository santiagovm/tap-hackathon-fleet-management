package com.wehaul.fleet.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TruckAvailabilityChanged {
    private int truckId;
    private boolean available;
}
