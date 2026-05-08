package com.univesp.barbearia.pi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ServicoEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Double price;
    private Integer duration; // minutos
}
