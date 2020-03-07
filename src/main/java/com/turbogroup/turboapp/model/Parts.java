package com.turbogroup.turboapp.model;

import javax.persistence.*;

@Entity
@Table(name = "parts", schema = "turbodb")
public class Parts {
    private Long id;
    private String name;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = " name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
