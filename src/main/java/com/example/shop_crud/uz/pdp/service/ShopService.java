package com.example.shop_crud.uz.pdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shop_crud.uz.pdp.repository.ShopRepository;

@Service
public class ShopService {

    @Autowired
    ShopRepository shopRepository;
}
