package com.br.dsena7.webflux.src.main.java.com.example.repository;

import com.example.domain.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, Long> {

}