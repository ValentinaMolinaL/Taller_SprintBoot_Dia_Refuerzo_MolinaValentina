package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Product;

@RestController
public class ProductRepository {
    
    @GetMapping("/tax")
    public Map<String, Object> calcular(
        @RequestParam(defaultValue = "0") double product) {
        List<Product> products = new ArrayList<>(
            List.of(new Product(1, "gaseosa", "bebida", 3000.00, 10))
            );
        products.add(new Product(2, "pan de queso", "panaderia", 1000.00, 10));
        products.add(new Product(3, "quesillo", "reposteria", 6000.00, 10));
        products.add(new Product(4, "cuajada", "reposteria", 6000.00, 10));
        products.add(new Product(5, "yoguer", "reposteria", 6000.00, 10));
        products.add(new Product(6, "torta", "reposteria", 6000.00, 10));
        products.add(new Product(7, "cappuchino", "cafeteria", 6000.00, 10));
        products.add(new Product(8, "frapuchino", "cafeteria", 6000.00, 10));
        products.add(new Product(9, "chocolate", "cafeteria", 6000.00, 10));
        products.add(new Product(10, "pan de bono", "panaderia", 6000.00, 10));
        products.add(new Product(11, "croasan", "panaderia", 6000.00, 10));
        products.add(new Product(12, "aguapanela", "cafeteria", 6000.00, 10));
        products.add(new Product(13, "buñuelos", "panaderia", 6000.00, 10));
        products.add(new Product(14, "churros", "panaderia", 6000.00, 10));
        products.add(new Product(15, "rosquillas", "panaderia", 6000.00, 10));
        products.add(new Product(16, "flan de maracuya", "reposteria", 6000.00, 10));
        products.add(new Product(17, "sandwich", "panaderia", 6000.00, 10));
        products.add(new Product(18, "pizza", "panaderia", 6000.00, 10));
        products.add(new Product(19, "pasta amarilla", "panaderia", 6000.00, 10));
        products.add(new Product(20, "torta fria", "reposteria", 6000.00, 10));

        return Map.of("productos", products);      

}

}
