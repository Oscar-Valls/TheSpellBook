package com.canvas.www.models;

import jakarta.persistence.*;

@Entity
@Table(name = "hechizos")
public class Spell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private int nivel;

    private String escuela;

    private String origen;

    private String componentes;

    @Column(name = "tiempo_lanzamiento")
    private String tiempoLanzamiento;

    private String alcance;

    private String duracion;

    @Column(length = 2000)
    private String clases;

    @Column(length = 5000)
    private String descripcion;

    @Column(length = 1000)
    private String efectoEspecial;

    private String tipo;

}
