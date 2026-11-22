package dev.java.registrationOfIndividuals;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/welcome")  // routes
    public String boasVindas(){
        return "Welcome to SpringBoot";
    }
}
