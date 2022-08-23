package com.banco.bancofinanceiro.model.transacao;

public class EfetuarTransferencia {
    public Transferir transferir(String opcao) {
        if (opcao.equalsIgnoreCase("depositar")) {
            return new Depositar();
        } else if (opcao.equalsIgnoreCase("sacar")) {
            return new Sacar();
        }
        return null;
    }
}