package com.project.foodorder.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private double totalPrice;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<OrderItem> orderItems;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customers customer;
}