package com.example.shop_crud.uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.shop_crud.uz.pdp.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ShopService shopService;

}
