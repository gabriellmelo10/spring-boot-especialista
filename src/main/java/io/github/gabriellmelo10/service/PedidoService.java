package io.github.gabriellmelo10.service;

import io.github.gabriellmelo10.domain.entity.Pedido;
import io.github.gabriellmelo10.domain.enums.StatusPedido;
import io.github.gabriellmelo10.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
