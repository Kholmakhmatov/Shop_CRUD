package com.example.shop_crud.uz.pdp.repository;

import com.example.shop_crud.uz.pdp.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop,Integer> {

}
