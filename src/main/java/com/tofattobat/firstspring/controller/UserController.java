package com.tofattobat.firstspring.controller;

import com.tofattobat.firstspring.model.Product;
import com.tofattobat.firstspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private ProductRepository productRepository;

    @Autowired
    public UserController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @ResponseBody
    @GetMapping("/listAll")
    public List<Product> productListAll(@RequestParam(required = false) String category) {
        List<Product> products = productRepository.listAll();
        List<Product> result = null;

        if (category.equals(null) || category.equals("")) {
            return products;

        } else {
            for (Product product : products) {
                if (product.getCategory().equals(category)) {
                    result.add(product);
                }
            }
            return result;
        }
    }
}
