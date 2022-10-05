package com.wehaul.fleet.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TRUCK")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TruckEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer truckId;

    private Integer miles;
    private Integer lastInspectionMiles;
    private Boolean available;
    private String availabilityReason;
}
