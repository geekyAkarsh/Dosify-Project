package com.example.DosifyProject.repository;

import com.example.DosifyProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
