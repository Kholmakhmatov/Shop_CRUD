package com.example.shop_crud.uz.pdp.repository;

import com.example.shop_crud.uz.pdp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
