package com.univesp.barbearia.pi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class ScheduleEntity {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime dateTime;

    @ManyToOne
    private UserEntity barber;

    @ManyToOne
    private UserEntity client;

    @ManyToOne
    private ServicoEntity servico;

    private String status; // SCHEDULED, CANCELED, DONE
}
