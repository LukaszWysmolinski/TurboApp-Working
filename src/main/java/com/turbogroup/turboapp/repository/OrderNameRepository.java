package com.turbogroup.turboapp.repository;

import com.turbogroup.turboapp.model.OrderName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderNameRepository extends JpaRepository<OrderName, Long> {
}
