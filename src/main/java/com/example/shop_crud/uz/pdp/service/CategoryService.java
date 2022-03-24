package com.example.shop_crud.uz.pdp.service;

import com.example.shop_crud.uz.pdp.dto.ApiResponse;
import com.example.shop_crud.uz.pdp.dto.CategoryDTO;
import com.example.shop_crud.uz.pdp.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shop_crud.uz.pdp.repository.CategoryRepository;

import java.util.List;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;



    public List<Category> getAll() {
        return categoryRepository.findAll();
    }


    public ApiResponse save(CategoryDTO categoryDTO) {
        Category category=new Category();
        category.setName(categoryDTO.getName());
     categoryRepository.save(category);
     return new ApiResponse("Added Category!",true);
    }


    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(Math.toIntExact(id)).get();
    }


    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }


    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(Math.toIntExact(id));
    }
}