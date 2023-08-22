package com.gefersonholdorf.crudclient.dto;

import java.time.Instant;

import com.gefersonholdorf.crudclient.entities.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    
    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Instant birthDate;
    private Integer children;

    public ClientDTO(Client entity) {
        this.setId(entity.getId());
        this.setName(entity.getName());
        this.setCpf(entity.getCpf());
        this.setIncome(entity.getIncome());
        this.setBirthDate(entity.getBirthDate());
        this.setChildren(entity.getChildren());
    }
}
