package com.turbogroup.turboapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "work_order", schema = "turbodb")
public class WorkOrder {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "charger_id")
    private Turbocharger turbocharger;

    @ManyToOne
    @JoinColumn(name = "part_id")
    private Parts part;

    @ManyToOne
    @JoinColumn(name = "reason_id")
    private Reason reason;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderName order;


}
