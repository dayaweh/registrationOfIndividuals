package dev.java.registrationOfIndividuals.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
/*
* Define um prefixo de URL para todos os métodos da classe. Como o seu está vazio,
* o prefixo é a raiz /. Se você escrevesse @RequestMapping("/users"),
* o metodo /welcome passaria a ser /users/welcome. É útil para agrupar os endpoints
*  de um mesmo recurso.
*
* */
public class UserController {

    @GetMapping("/welcome")  // routes
    public String boasVindas(){
        return "Welcome to SpringBoot";
    }
}
