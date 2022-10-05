package com.wehaul.fleet.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Truck {
    private int truckId;
    private int miles;
    private int lastInspectionMiles;
    private Boolean available;
    private String availabilityReason;
}
