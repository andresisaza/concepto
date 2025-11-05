package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {


    @GetMapping("/hola")
    public String hola()  {
        return "Hola desde holaController 🚀 con cabecera: ";
    }



}