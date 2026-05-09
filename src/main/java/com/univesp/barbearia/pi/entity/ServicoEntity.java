package com.univesp.barbearia.pi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "servico")
@Table(name = "servico")
public class ServicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private Integer duration; // minutos
}
