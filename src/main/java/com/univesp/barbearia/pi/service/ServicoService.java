package com.univesp.barbearia.pi.service;

import com.univesp.barbearia.pi.dto.ServicoDTO;

import java.util.List;

public interface ServicoService {

    Boolean registerServico(ServicoDTO servico);

    List<String> searchServico(String searchServico);
}
