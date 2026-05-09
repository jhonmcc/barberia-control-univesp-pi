package com.univesp.barbearia.pi.repository;

import com.univesp.barbearia.pi.entity.ServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoRepository extends JpaRepository<ServicoEntity, Long>, JpaSpecificationExecutor<ServicoEntity> {

    @Query("SELECT s.name FROM servico s WHERE s.name LIKE %:searchServico%")
    List<String> findAllByName(@Param("searchServico") String searchServico);
}
