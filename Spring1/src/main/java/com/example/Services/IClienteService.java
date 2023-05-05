/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Services;

import com.example.entity.ClientEntity;
import java.util.List;

/**
 *
 * @author BDG-GGUERRERO
 */
public interface IClienteService {
    List<ClientEntity> findAll();
    ClientEntity getById(Long id);
    ClientEntity update(ClientEntity client, Long id);
    void delete(Long id);    
    ClientEntity create(ClientEntity client);

}


