
package com.dussanpalma.demo.controllers;

import com.dussanpalma.demo.models.entity.Product;
import com.dussanpalma.demo.models.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductRestController {
    
    @Autowired
    private IProductService productService;
    
    @GetMapping("/productos")
    public List<Product> index(){
        return productService.findAll();
  
    }
    
}
