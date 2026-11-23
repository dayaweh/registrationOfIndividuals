package dev.java.registrationOfIndividuals.Professions;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProfessionsController {

    @GetMapping("/profissoes")
    public String profissoes(){
        return "Profissoes";
    }
}
