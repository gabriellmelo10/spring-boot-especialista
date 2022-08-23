package io.github.gabriellmelo10.service;

import io.github.gabriellmelo10.domain.entity.Pedido;
import io.github.gabriellmelo10.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
}
