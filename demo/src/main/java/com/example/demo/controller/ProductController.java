package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
		//Aquí usas inyecciónes de Dependencias
    private final ProductRepository repo;
    public ProductController(ProductRepository repo) { this.repo = repo; }

    @GetMapping("/products")
    public List<Product> getProducts(
        @RequestParam(required = false) Double minPrice,
        @RequestParam(required = false) Double maxPrice,
        @RequestParam(required = false) String category
    ) {
      	//Aplica los filtros de minPrice, maxPrice y category, recuerda que pueden aplicarse todos o ninguno
        return listadoFiltrado;
    }
}