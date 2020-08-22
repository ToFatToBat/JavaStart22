package com.tofattobat.firstspring.repository;

import com.tofattobat.firstspring.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {

        products.add (new Product("Pudliszki", 5.55, "Art. spozywcze"));
        products.add (new Product("Heinz", 6.20, "Art. spozywcze"));
        products.add (new Product("Dawtona", 4.99, "Art. spozywcze"));
        products.add (new Product("Pepsi", 5.99, "Art. spozywcze"));
        products.add (new Product("Patelnia - Tefal", 43.99, "Art. gosp. domowego"));
        products.add (new Product("Philips - Blender", 150, "Art. gosp. domowego"));
        products.add (new Product("Noze - Fiskars", 150, "Art. gosp. domowego"));
        products.add (new Product("Bluza - FOX", 180, "Inne"));
        products.add (new Product("Okulary", 150, "Inne"));
        products.add (new Product("Torebka", 450, "Inne"));
        products.add (new Product("Szpilki", 649.99, "Inne"));
    }

    public List<Product> listAll() {return new ArrayList<>(products);}
}
