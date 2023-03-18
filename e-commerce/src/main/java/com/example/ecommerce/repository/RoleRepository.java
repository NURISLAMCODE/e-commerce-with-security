package com.example.ecommerce.repository;

import com.example.ecommerce.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
