package com.banco.bancofinanceiro.model.transacao;

import com.banco.bancofinanceiro.model.ContaModel;

import java.math.BigDecimal;

public interface Transferir {
    public BigDecimal transferir(ContaModel contaModel);
}
