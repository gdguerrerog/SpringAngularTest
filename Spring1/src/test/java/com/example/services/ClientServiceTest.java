/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.services;

import com.example.Services.ClientServiceImpl;
import com.example.entity.ClientEntity;
import com.example.repositories.IClienteRepository;
import java.util.Date;
import java.util.Optional;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author BDG-GGUERRERO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceTest {
    @MockBean
    private IClienteRepository clientRepository;

    @Autowired
    private ClientServiceImpl clientService;
    
    @Test
    public void testFindById() {
        ClientEntity created = new ClientEntity(0l, "German", "Guerrero", "german@mail.com", new Date());
        when(clientRepository.findById(0l)).thenReturn(Optional.of(created));
        Assertions.assertEquals(created, clientService.getById(0l));
    }
}
