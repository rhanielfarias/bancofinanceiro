package com.banco.bancofinanceiro.model.transacao;

import com.banco.bancofinanceiro.model.ContaModel;

import java.math.BigDecimal;

public class Sacar implements  Transferir{
    @Override
    public BigDecimal transferir(ContaModel contaModel) {
    return contaModel.getValorAtualDaConta().subtract(contaModel.getValorFornecido());
    }
}
