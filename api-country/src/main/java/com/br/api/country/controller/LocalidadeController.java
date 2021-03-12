package com.br.api.country.controller;

import com.br.api.country.model.Cidade;
import com.br.api.country.model.Estado;
import com.br.api.country.model.Pais;
import com.br.api.country.service.PaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/app/v1")
public class LocalidadeController {

    @Autowired
    private PaisService service;

    @GetMapping("/paises")
    public ResponseEntity<List<Pais>> findPaises() {
        return ResponseEntity.ok(service.findPaises());
    }

    @GetMapping("/paises/{id}/estados")
    public ResponseEntity<List<Estado>> findEstados(@PathVariable Long id) {
        return ResponseEntity.ok(service.findEstadosByPais(id));
    }

    @GetMapping("/estados/{id}/cidades")
    public ResponseEntity<List<Cidade>> findCidades(@PathVariable Long id) {
        return ResponseEntity.ok(service.findCidadesByEstado(id));
    }

}
