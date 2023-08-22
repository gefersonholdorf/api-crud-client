package com.gefersonholdorf.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gefersonholdorf.crudclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
