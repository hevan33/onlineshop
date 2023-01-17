package pl.apro.onlineshop.about;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutUsController {

    @RequestMapping("/about")
    public String sayHello(){
        return "Welcome on my site";
    }

}