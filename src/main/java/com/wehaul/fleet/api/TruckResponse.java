package com.wehaul.fleet.api;

public record TruckResponse(
        int truckId,
        int miles,
        int lastInspectionMiles,
        boolean available,
        String availabilityReason
) {
}
