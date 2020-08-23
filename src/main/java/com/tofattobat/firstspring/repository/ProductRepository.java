package com.tofattobat.firstspring.repository;

import com.tofattobat.firstspring.model.Category;
import com.tofattobat.firstspring.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

    private static List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        products.add(new Product("Pudliszki", 5.55, Category.GROCERY));
        products.add(new Product("Heinz", 6.20, Category.GROCERY));
        products.add(new Product("Dawtona", 4.99, Category.GROCERY));
        products.add(new Product("Pepsi", 5.99, Category.GROCERY));
        products.add(new Product("Patelnia - Tefal", 43.99, Category.HOUSEHOLD));
        products.add(new Product("Philips - Blender", 150, Category.HOUSEHOLD));
        products.add(new Product("Noze - Fiskars", 150, Category.HOUSEHOLD));
        products.add(new Product("Bluza - FOX", 180, Category.OTHER));
        products.add(new Product("Okulary", 150, Category.OTHER));
        products.add(new Product("Torebka", 450, Category.OTHER));
        products.add(new Product("Szpilki", 649.99, Category.OTHER));
    }

    public List<Product> listAll() {
        return new ArrayList<>(products);
    }

    public List<Product> productByCategory(Category category) {
        return products.stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());


    }
}
