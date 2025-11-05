package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hola2Controller {

    @GetMapping("/hola22")
    public String hola22() {
        return "Hola desde /hola2 🚀";
    }
}