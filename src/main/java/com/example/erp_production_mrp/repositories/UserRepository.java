package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
