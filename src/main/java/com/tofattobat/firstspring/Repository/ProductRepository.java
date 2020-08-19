package com.tofattobat.firstspring.Repository;

import com.tofattobat.firstspring.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

   private List<Product> products;

    public ProductRepository(List<Product> products) {
        products = new ArrayList<>();
        products.add(new Product("Pudliszki", 5.55, "Art. spozywcze"));
        products.add(new Product("Heinz", 6.20, "Art. spozywcze"));
        products.add(new Product("Dawtona", 4.99, "Art. spozywcze"));
        products.add(new Product("Pepsi", 5.99, "Art. spozywcze"));
        products.add(new Product("Patelnia - Tefal", 43.99, "Art. gosp. domowego"));
        products.add(new Product("Philips - Blender", 150, "Art. gosp. domowego"));
        products.add(new Product("Noze - Fiskars", 150, "Art. gosp. domowego"));
        products.add(new Product("Bluza - FOX", 150, "Inne"));
        products.add(new Product("Okulary", 150, "Inne"));
        products.add(new Product("Torebka", 150, "Inne"));
        products.add(new Product("Szpilki", 150, "Inne"));

    }
}
