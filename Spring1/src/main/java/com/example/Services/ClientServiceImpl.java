/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Services;

import com.example.entity.ClientEntity;
import com.example.repositories.IClienteRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author BDG-GGUERRERO
 */
@Service
public class ClientServiceImpl implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;
    
    @Override
    public List<ClientEntity> findAll() {
        List<ClientEntity> result = new ArrayList<ClientEntity>();
        clienteRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public ClientEntity getById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public ClientEntity update(ClientEntity client, Long id) {
        ClientEntity currentClient = clienteRepository.findById(id).orElseThrow();
    
        currentClient.setNombre(client.getApellido());
        currentClient.setApellido(client.getApellido());
        currentClient.setEmail(client.getApellido());

        clienteRepository.save(currentClient);
        return currentClient;
    }
    
    

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
    
}
