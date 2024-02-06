package com.project.foodorder.repositories;

import com.project.foodorder.models.Menu;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    @Nonnull
    List<Menu> findAll();
}