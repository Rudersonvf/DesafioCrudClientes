package com.rudersonvf.DesafioCrudClientes.repositories;

import com.rudersonvf.DesafioCrudClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
