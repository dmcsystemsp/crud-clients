package com.dmcsystemsp.crudclientes.controllers;

import com.dmcsystemsp.crudclientes.dto.ClientDTO;
import com.dmcsystemsp.crudclientes.entities.Client;
import com.dmcsystemsp.crudclientes.repositories.ClientRepository;
import com.dmcsystemsp.crudclientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
       return service.findById(id);
     }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }
}

