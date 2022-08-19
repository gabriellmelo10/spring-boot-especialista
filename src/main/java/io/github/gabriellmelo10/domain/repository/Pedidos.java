package io.github.gabriellmelo10.domain.repository;

import io.github.gabriellmelo10.domain.entity.Cliente;
import io.github.gabriellmelo10.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
