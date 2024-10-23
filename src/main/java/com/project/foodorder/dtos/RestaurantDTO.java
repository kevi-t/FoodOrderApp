package com.project.foodorder.dtos;

import com.project.foodorder.models.Menu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class RestaurantDTO {
    private String restaurantName;
    private String location;
    private double rating;
//    private List<Menu> menus;
}