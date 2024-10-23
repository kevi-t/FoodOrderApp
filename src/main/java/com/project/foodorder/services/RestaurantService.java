package com.project.foodorder.services;

import com.project.foodorder.dtos.RestaurantDTO;
import com.project.foodorder.models.Restaurants;
import com.project.foodorder.repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public List<RestaurantDTO> getAllRestaurants() {
        List<Restaurants> restaurantList = restaurantRepository.findAll();

        // Create a new list to store filtered restaurants (converted to DTO)
        List<RestaurantDTO> filteredRestaurants = new ArrayList<>();
        for (Restaurants restaurant : restaurantList) {
            RestaurantDTO restaurantDTO = new RestaurantDTO();

            restaurantDTO.setRestaurantName(restaurant.getRestaurantName());
            restaurantDTO.setLocation(restaurant.getLocation());
            restaurantDTO.setRating(restaurant.getRating());
            //restaurantDTO.setMenus(restaurant.getMenus());

            filteredRestaurants.add(restaurantDTO);
        }
        return filteredRestaurants;
    }
}