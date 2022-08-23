package com.banco.bancofinanceiro.repository;

import com.banco.bancofinanceiro.model.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Long> {
}
