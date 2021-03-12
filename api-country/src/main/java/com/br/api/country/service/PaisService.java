package com.br.api.country.service;

import com.br.api.country.model.Cidade;
import com.br.api.country.model.Estado;
import com.br.api.country.model.Pais;
import com.br.api.country.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {
    
    @Autowired
    private PaisRepository repository;
    
    public List<Pais> findPaises(){
        return repository.findAll();
    }
    
    public List<Estado> findEstadosByPais(Long idPais){
        return repository.findEstadosByPais(idPais);
    }
    
    public List<Cidade> findCidadesByEstado(Long idEstado){
        return repository.findCidadesByEstado(idEstado);
    }
    
}
