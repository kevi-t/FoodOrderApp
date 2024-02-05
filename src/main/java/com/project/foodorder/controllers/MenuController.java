package com.project.foodorder.controllers;

import com.project.foodorder.models.Menu;
import com.project.foodorder.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foodOrderApp/menus")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/restaurant/{restaurantId}")
    public List<Menu> getMenusByRestaurant(@PathVariable Long restaurantId) {
        return menuService.getMenusByRestaurant(restaurantId);
    }

    // other controller methods...
}