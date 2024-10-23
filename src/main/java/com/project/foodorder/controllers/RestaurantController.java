//package com.project.foodorder.controllers;
//
//import com.project.foodorder.dtos.RestaurantDTO;
//import com.project.foodorder.services.RestaurantService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/foodOrderApp/restaurants")
//public class RestaurantController {
//
//    private final RestaurantService restaurantService;
//
//    @Autowired
//    public RestaurantController(RestaurantService restaurantService) {
//        this.restaurantService = restaurantService;
//    }
//
//    @GetMapping
//    public List<RestaurantDTO> getAllRestaurants() {
//
//        return restaurantService.getAllRestaurants();
//    }
//
////    @GetMapping("/{id}")
////    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Long id) {
////          Optional<Restaurant> restaurant = restaurantRepository.findById(id);
////          return restaurant.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
////    }
////
////        // Other endpoints for searching, adding reviews, etc.
//}