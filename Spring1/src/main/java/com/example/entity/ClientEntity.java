/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * @author BDG-GGUERRERO
 */
@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name="cliente")
public class ClientEntity implements Serializable {
    
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    
    @Column(name="created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    
    @PrePersist
    void prePersist() {
        this.createdAt = new Date();
    }
}
