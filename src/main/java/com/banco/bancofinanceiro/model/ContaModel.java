package com.banco.bancofinanceiro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contabancaria")
public class ContaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(length = 50, nullable = false)
    private String numeroDeConta;

    @Column(length = 50, nullable = false)
    private String agencia;
    @Column(length = 50, nullable = false)
    private String nomeDoUsuario;
    @Column(length = 50, nullable = false)
    private BigDecimal valorAtualDaConta;
    @Column(length = 50, nullable = false)
    private BigDecimal valorFinal;
    @Column(length = 50, nullable = false)
    private BigDecimal valorFornecido;

    @Column(length = 50, nullable = false)
    private String tipoDeServico;


}
