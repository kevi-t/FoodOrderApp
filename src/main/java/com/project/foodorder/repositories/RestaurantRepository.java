package com.project.foodorder.repositories;

import com.project.foodorder.models.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurants, Long> {
}