package com.project.foodorder.repositories;

import com.project.foodorder.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findAll();

    // Additional query methods if needed
}