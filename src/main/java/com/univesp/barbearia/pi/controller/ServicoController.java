package com.univesp.barbearia.pi.controller;

import com.univesp.barbearia.pi.dto.ServicoDTO;
import com.univesp.barbearia.pi.service.ServicoService;
import org.hibernate.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/servico")
public class ServicoController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private ServicoService servicoService;

    @PostMapping(path = "/register")
    public Boolean registerUser(@RequestBody ServicoDTO servico) {
        try {
            servicoService.registerServico(servico);
            return true;

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return false;
        }
    }

    @GetMapping(path = "/search")
    public List<String> searchServico(@RequestParam(value = "searchServico") String searchServio) {
        try {
            return servicoService.searchServico(searchServio);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new ArrayList<>();
        }
    }
}
