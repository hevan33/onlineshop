package pl.apro.onlineshop.contact;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @RequestMapping("/contact")
    public String sayHello(){
        return "Welcome on my site";
    }

}