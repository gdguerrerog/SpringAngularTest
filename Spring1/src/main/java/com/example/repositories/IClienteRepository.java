/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.repositories;

import com.example.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author BDG-GGUERRERO
 */
public interface IClienteRepository extends CrudRepository<ClientEntity, Long> {
    
}
