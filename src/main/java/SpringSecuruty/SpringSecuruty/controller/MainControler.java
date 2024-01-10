package SpringSecuruty.SpringSecuruty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControler {
    @GetMapping("/")
    public String homePage (){
        return "home" ;
    }
    @GetMapping("/aut")
    public String pageForAutUser(){
        return "secured page of web service" ;
    }
}
