package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.common.Response;
import com.ecommerce.ecommerce.entity.Product;
import com.ecommerce.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<Response> getAllProducts(){
        Response response =productService.getAllProducts();

        return ResponseEntity.status(response.getStatus()).body(response);

    }

    @PostMapping("/create")
    public ResponseEntity<Response> createProducts(@RequestBody Product product){
        Response response =productService.createProducts(product);

        return ResponseEntity.status(response.getStatus()).body(response);

    }



}
