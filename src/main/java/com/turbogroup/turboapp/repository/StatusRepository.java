package com.turbogroup.turboapp.repository;

import com.turbogroup.turboapp.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status,Long> {
}
