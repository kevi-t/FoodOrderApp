package com.project.foodorder.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//    private List<OrderItem> orderItems;


}