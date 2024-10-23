package com.project.foodorder.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String email;
    private String password;
    private String location;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Orders> orders;
}