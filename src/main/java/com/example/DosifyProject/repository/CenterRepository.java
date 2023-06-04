package com.example.DosifyProject.repository;

import com.example.DosifyProject.model.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends JpaRepository<VaccinationCenter,Integer> {
}
