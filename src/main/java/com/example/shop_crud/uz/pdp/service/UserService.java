package com.example.shop_crud.uz.pdp.service;

import com.example.shop_crud.uz.pdp.dto.ApiResponse;
import com.example.shop_crud.uz.pdp.entity.Shop;
import com.example.shop_crud.uz.pdp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shop_crud.uz.pdp.dto.UserDTO;
import com.example.shop_crud.uz.pdp.repository.ShopRepository;
import com.example.shop_crud.uz.pdp.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ShopRepository shopRepository;

    public ApiResponse addUser(UserDTO dto) {
        User user=new User();
        user.setFullName(dto.getFullName());

        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setConiformPassword(dto.getConfirmPassword());
        Optional<Shop> byId = shopRepository.findById(1);
        Shop shop = byId.get();
        user.setShop(shop);
        User save = userRepository.save(user);
        return new ApiResponse("Added",true,save);
    }

    public ApiResponse login(UserDTO dto) {
        for (User user : userRepository.findAll()) {

            if (user.getEmail().equals(dto.getEmail())

                    && user.getPassword().equals(dto.getPassword())){

                return new ApiResponse("No Login",false);
            }
        }
        return new ApiResponse("Login",true);
    }
}
