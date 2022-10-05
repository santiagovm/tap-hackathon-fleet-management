package com.wehaul.fleet.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckJpaRepository extends JpaRepository<TruckEntity, Integer> {
}
