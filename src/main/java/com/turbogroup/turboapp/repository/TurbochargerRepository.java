package com.turbogroup.turboapp.repository;

import com.turbogroup.turboapp.model.Turbocharger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurbochargerRepository extends JpaRepository<Turbocharger, Long> {
}
