package com.mvc.citizen.repository;

import com.mvc.citizen.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen,Integer> {
   // Citizen findByName(String name);
}
