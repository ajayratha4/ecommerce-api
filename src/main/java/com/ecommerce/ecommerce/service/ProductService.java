package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.common.Response;
import com.ecommerce.ecommerce.entity.Product;
import com.ecommerce.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Response getAllProducts(){
        Response response = new Response();
       List<Product> data= productRepository.findAll();
        response.setData(data);
        response.setStatus(HttpStatus.OK.value());
       return response;

    }

    public  Response createProducts(Product product){
        Response response = new Response();
        Product data= productRepository.save(product);
        response.setData(data);
        response.setStatus(HttpStatus.OK.value());
        return response;
    }
}
