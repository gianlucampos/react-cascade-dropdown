package com.br.api.country.repository;

import com.br.api.country.model.Cidade;
import com.br.api.country.model.Estado;
import com.br.api.country.model.Pais;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaisRepository extends JpaRepository<Pais, Long> {

    @Query("SELECT distinct(estado) FROM Estado estado where estado.pais.id = :paisId")
    List<Estado> findEstadosByPais(@Param("paisId") Long paisId);

    @Query("SELECT distinct(cidade) FROM Cidade cidade where cidade.estado.id = :estadoId")
    List<Cidade> findCidadesByEstado(@Param("estadoId") Long estadoId);

}
