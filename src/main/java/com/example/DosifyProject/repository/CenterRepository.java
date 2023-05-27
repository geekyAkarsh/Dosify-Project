package com.example.DosifyProject.repository;

import com.example.DosifyProject.model.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CenterRepository extends JpaRepository<VaccinationCenter,Integer> {
}
