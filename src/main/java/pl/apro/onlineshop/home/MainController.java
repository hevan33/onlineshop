package pl.apro.onlineshop.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String sayHello(){
        return "Welcome on my site";
    }

}
