package io.github.gabriellmelo10.domain.repository;

import io.github.gabriellmelo10.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
