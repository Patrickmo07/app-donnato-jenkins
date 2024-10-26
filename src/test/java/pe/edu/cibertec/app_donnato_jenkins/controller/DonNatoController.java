package pe.edu.cibertec.app_donnato_jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apo/donnatoo")
public class DonNatoController {
    public String testJenkins(){
        return "Hola sobrin@, aperturando con  Jenkins";
    }
}

