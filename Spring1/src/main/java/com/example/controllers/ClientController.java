/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controllers;

import com.example.Services.IClienteService;
import com.example.entity.ClientEntity;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author BDG-GGUERRERO
 */
@RestController
@RequestMapping("/api")
@CrossOrigin()
public class ClientController {
    
    @Autowired
    private IClienteService clientService;
    
    @GetMapping("/clientes")
    public List<ClientEntity> index() {
        return clientService.findAll();
    }
    
    @GetMapping
    public ClientEntity update(ClientEntity client, @PathVariable Long id) {
        try {
            return clientService.update(client, id);
        } catch (NoSuchElementException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Client with ID " + id + " not found");
        }
    }
    
    
}
