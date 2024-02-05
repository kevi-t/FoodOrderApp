package com.project.foodorder.repositories;

import com.project.foodorder.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByRestaurantId(Long restaurantId);

    // List<Menu> findByRestaurantId(Long restaurantId);
}