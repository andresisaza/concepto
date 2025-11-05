package org.example;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/estudiantes")
public class estudiantesController {

    private final estudianteRepository estudianteRepository_;
    public estudiantesController(estudianteRepository estudianteRepository_) {
        this.estudianteRepository_ = estudianteRepository_;
    }


    @GetMapping
    public Flux<estudiantes> getAll() {
        return estudianteRepository_.findAll();
    }

}