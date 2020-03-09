package com.turbogroup.turboapp.repository;

import com.turbogroup.turboapp.model.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOrderRepository extends JpaRepository<WorkOrder,Long> {
}
