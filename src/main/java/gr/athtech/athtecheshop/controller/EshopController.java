package gr.athtech.athtecheshop.controller;


import gr.athtech.athtecheshop.model.Product;
import gr.athtech.athtecheshop.service.EshopService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class EshopController {

    private EshopService service;




    @GetMapping("/product")
    public List<Product> getProducts(){

        return service.showProducts();
    }


    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

}
