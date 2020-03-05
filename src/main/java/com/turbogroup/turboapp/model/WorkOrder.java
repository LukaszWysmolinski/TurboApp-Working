package com.turbogroup.turboapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Table(name = "work_order", schema = "turbodb")
public class WorkOrder {

    @Id
    private Long id;

    @JoinColumn(name = "charger_id")
    private Turbocharger turbocharger;
    @JoinColumn(name="part_id")
    private Parts part;
    @JoinColumn(name="reason_id")
    private Reason reason;
    @JoinColumn(name="customer_id")
    private Customer customer;
    @JoinColumn(name="order_id")
    private OrderName order;


}
