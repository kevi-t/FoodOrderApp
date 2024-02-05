package com.project.foodorder.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Collection;
import java.util.List;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private String cuisine;
    @NotNull
    private String location;
    @NotNull
    private double rating;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Menu> menus;


}