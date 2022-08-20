package io.github.gabriellmelo10.domain.repository;

import io.github.gabriellmelo10.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
