package org.example;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import org.springframework.data.r2dbc.repository.Query;

public interface estudianteRepository extends ReactiveCrudRepository<estudiantes, Long> {


    // método custom usando consulta SQL
    @Query("SELECT * FROM estudiantes")
    Flux<estudiantes> findAll();
}