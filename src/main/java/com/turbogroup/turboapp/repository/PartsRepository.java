package com.turbogroup.turboapp.repository;

import com.turbogroup.turboapp.model.Parts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartsRepository extends JpaRepository<Parts, Long> {
}
