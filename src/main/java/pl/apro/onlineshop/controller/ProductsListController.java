package pl.apro.onlineshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsListController {

    @RequestMapping("/products")
    public String sayHello(){
        return "Hey";
    }

}