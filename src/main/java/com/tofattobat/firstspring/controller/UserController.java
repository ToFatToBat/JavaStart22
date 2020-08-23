package com.tofattobat.firstspring.controller;

import com.tofattobat.firstspring.model.Category;
import com.tofattobat.firstspring.model.Product;
import com.tofattobat.firstspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
public class UserController {

    private ProductRepository productRepository;

    @Autowired
    public UserController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @ResponseBody
    @GetMapping("/listAll")
    public List<Product> productListAll(@RequestParam(required = false) Category category) {
        List<Product> result = null;

        if (category == null || category.equals("")) {
            result = productRepository.listAll();
        } else {
            result = productRepository.productByCategory(category);
        }
        return result;
    }
}


