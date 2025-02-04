package com.project.foodorder.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;
    private String menuName;
    private String menuDescription;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "restaurantId")
    private Restaurants restaurant;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<MenuItems> items;
}