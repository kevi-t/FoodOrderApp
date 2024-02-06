package com.project.foodorder.repositories;

import com.project.foodorder.models.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    //List findByMenuId(Long menuId);
}