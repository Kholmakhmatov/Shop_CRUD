package com.example.shop_crud.uz.pdp.repository;

import com.example.shop_crud.uz.pdp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
