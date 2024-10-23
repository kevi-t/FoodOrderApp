package com.project.foodorder.repositories;

import com.project.foodorder.models.MenuItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItems, Long> {
    //List findByMenuId(Long menuId);
}