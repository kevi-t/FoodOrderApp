package com.project.foodorder.services;

import com.project.foodorder.dtos.MenuDTO;
import com.project.foodorder.models.Menu;
import com.project.foodorder.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<MenuDTO> getAllMenus() {
        List<Menu> menuList = menuRepository.findAll();
        List<MenuDTO> filteredMenu = new ArrayList<>();

        for (Menu menu: menuList){
            MenuDTO menuDTO = new MenuDTO();

            menuDTO.setMenu_id(menu.getMenu_id());
            menuDTO.setName(menu.getName());
            filteredMenu.add(menuDTO);
        }
        // implement logic to get menus by restaurant id
        return filteredMenu;
    }

    // other service methods...
}