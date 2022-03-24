package com.example.shop_crud.uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.shop_crud.uz.pdp.dto.UserDTO;
import com.example.shop_crud.uz.pdp.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    UserService userService;

    @PostMapping
    public String add(@ModelAttribute UserDTO dto){
         userService.addUser(dto);
         return "index";
    }

}
