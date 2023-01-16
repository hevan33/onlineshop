package pl.apro.onlineshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/home")
    public String sayHello(){
        return "Welcome on my site";
    }

}
