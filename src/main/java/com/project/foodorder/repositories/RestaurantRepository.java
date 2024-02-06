package com.project.foodorder.repositories;

import com.project.foodorder.models.Restaurant;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Nonnull
    List<Restaurant> findAll();
    // Additional query methods if needed
}