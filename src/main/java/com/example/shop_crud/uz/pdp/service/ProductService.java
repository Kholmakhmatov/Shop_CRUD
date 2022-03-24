package com.example.shop_crud.uz.pdp.service;

import com.example.shop_crud.uz.pdp.dto.ApiResponse;
import com.example.shop_crud.uz.pdp.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shop_crud.uz.pdp.dto.ProductDTO;
import com.example.shop_crud.uz.pdp.entity.Product;
import com.example.shop_crud.uz.pdp.repository.CategoryRepository;
import com.example.shop_crud.uz.pdp.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;



    public ApiResponse save(ProductDTO productDTO) {
        Product product =new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        Optional<Category> byId = categoryRepository.findById(productDTO.getCategoryId());
        Category category = byId.get();
        product.setCategory(category);
        productRepository.save(product);
        return new ApiResponse("Added Product!",true);
    }


    public List<Product> getAll() {
        return productRepository.findAll();
    }


    public Product saveProduct(Product category) {
        return productRepository.save(category);
    }


    public Product getProductById(Integer id) {
        return productRepository.findById(Math.toIntExact(id)).get();
    }

    public Product updateProduct(Product category) {
        return productRepository.save(category);
    }


    public void deleteProductById(Integer id) {
        productRepository.deleteById(Math.toIntExact(id));
    }
}
