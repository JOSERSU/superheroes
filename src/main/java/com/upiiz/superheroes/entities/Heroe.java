package com.upiiz.superheroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "heroe")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Heroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String poder;
    private String universo;
    private String debilidad;

    @Column(name = "url_imagen")
    private String urlImagen;

}
