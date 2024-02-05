package com.project.foodorder.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

}