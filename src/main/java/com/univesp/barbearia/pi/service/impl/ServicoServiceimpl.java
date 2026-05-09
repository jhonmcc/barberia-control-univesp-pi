package com.univesp.barbearia.pi.service.impl;

import com.univesp.barbearia.pi.dto.ServicoDTO;
import com.univesp.barbearia.pi.entity.ServicoEntity;
import com.univesp.barbearia.pi.repository.ServicoRepository;
import com.univesp.barbearia.pi.service.ServicoService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class ServicoServiceimpl implements ServicoService {
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private ServicoRepository servicoRepository;

    @Override
    public Boolean registerServico(ServicoDTO servico) {
        try{
            servicoRepository.save(new ServicoEntity(null, servico.getName(), servico.getPrice(), servico.getDuration()));
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    @Override
    public List<String> searchServico(String searchServico) {
        try{
            return servicoRepository.findAllByName(searchServico);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ArrayList<>();
        }
    }


}
