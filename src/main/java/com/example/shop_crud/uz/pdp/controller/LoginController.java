package com.example.shop_crud.uz.pdp.controller;


import com.example.shop_crud.uz.pdp.dto.UserDTO;
import com.example.shop_crud.uz.pdp.entity.User;
import com.example.shop_crud.uz.pdp.repository.UserRepository;
import com.example.shop_crud.uz.pdp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public String login(@ModelAttribute UserDTO userDTO) {
        if(userDTO.getEmail().equalsIgnoreCase("kholmakhmatovanvar@gmail.com") && userDTO.getPassword().equalsIgnoreCase("123")){
            return "adminPage";
        }

        for (User user : userRepository.findAll()) {

            if(user.getPassword().equals(userDTO.getPassword()) && user.getEmail().equals(userDTO.getEmail())){
              return "userPage";
            }
        }

        return "index";
    }


}
