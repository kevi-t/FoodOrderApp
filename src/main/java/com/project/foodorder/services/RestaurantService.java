package com.project.foodorder.services;

import com.project.foodorder.dtos.RestaurantDTO;
import com.project.foodorder.models.Restaurant;
import com.project.foodorder.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<RestaurantDTO> getAllRestaurants() {
        List<Restaurant> restaurantList = restaurantRepository.findAll();

        // Create a new list to store filtered restaurants (converted to DTO)
        List<RestaurantDTO> filteredRestaurants = new ArrayList<>();

        for (Restaurant restaurant : restaurantList) {
            RestaurantDTO restaurantDTO = new RestaurantDTO();

            // Set properties on restaurantDTO based on properties of the restaurant entity
            restaurantDTO.setId(restaurant.getId());
            restaurantDTO.setCuisine(restaurant.getCuisine());
            restaurantDTO.setLocation(restaurant.getLocation());
            restaurantDTO.setName(restaurant.getName());
            restaurantDTO.setRating(restaurant.getRating());

            // Add the filtered restaurant (DTO) to the list
            filteredRestaurants.add(restaurantDTO);
        }
        return filteredRestaurants;

    }

    // other service methods...
}