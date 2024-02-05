package com.project.foodorder.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class RestaurantDTO {
    private Long id;
    private String name;
    private String cuisine;
    private String location;
    private double rating;
}