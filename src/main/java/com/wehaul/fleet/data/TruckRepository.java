package com.wehaul.fleet.data;

import com.wehaul.fleet.domain.Truck;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TruckRepository {

    private final TruckJpaRepository jpaRepo;

    public Truck create(Truck truck) {
        TruckEntity entity = toEntity(truck);
        TruckEntity savedEntity = jpaRepo.save(entity);
        return fromEntity(savedEntity);
    }

    public List<Truck> findAll() {
        return jpaRepo.findAll()
                .stream()
                .map(this::fromEntity)
                .toList();
    }

    public Optional<Truck> findById(int truckId) {
        return jpaRepo.findById(truckId).map(this::fromEntity);
    }

    public void update(Truck truck) {
        jpaRepo.save(toEntity(truck));
    }

    private Truck fromEntity(TruckEntity entity) {
        return new Truck(
                entity.getTruckId(),
                entity.getMiles(),
                entity.getLastInspectionMiles(),
                entity.getAvailable(),
                entity.getAvailabilityReason()
        );
    }

    private TruckEntity toEntity(Truck truck) {
        return new TruckEntity(
                truck.getTruckId(),
                truck.getMiles(),
                truck.getLastInspectionMiles(),
                truck.getAvailable(),
                truck.getAvailabilityReason()
        );
    }
}
