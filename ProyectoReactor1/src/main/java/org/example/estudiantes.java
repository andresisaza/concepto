package org.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("clientes")
public class estudiantes {

    private String nombre;
    @Id
    private String dui;

    public String getDui() {
        return dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    // Getters & Setters

}