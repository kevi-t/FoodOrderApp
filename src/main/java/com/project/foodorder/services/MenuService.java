package com.project.foodorder.services;

import com.project.foodorder.models.Menu;
import com.project.foodorder.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getMenusByRestaurant(Long restaurantId) {
        // implement logic to get menus by restaurant id
        return menuRepository.findByRestaurantId(restaurantId);
    }

    // other service methods...
}