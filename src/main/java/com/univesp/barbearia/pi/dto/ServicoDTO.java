package com.univesp.barbearia.pi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicoDTO {
    private String name;
    private Double price;
    private Integer duration; // minutos
}
