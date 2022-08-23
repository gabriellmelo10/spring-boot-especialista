package io.github.gabriellmelo10.service.impl;

import io.github.gabriellmelo10.domain.repository.Pedidos;
import io.github.gabriellmelo10.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
