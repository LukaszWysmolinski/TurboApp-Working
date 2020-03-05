package com.turbogroup.turboapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "order_name", schema = "turbodb")
public class OrderName {
    private Long id;
    private Timestamp orderDate;
    private Integer status;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic                                          // @Basic means >not null< column
    @Column(name = "order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
