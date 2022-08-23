package com.banco.bancofinanceiro.service;

import com.banco.bancofinanceiro.model.ContaModel;
import com.banco.bancofinanceiro.model.transacao.EfetuarTransferencia;
import com.banco.bancofinanceiro.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public List<ContaModel> buscarConta() {
        return contaRepository.findAll();
    }

    public Optional<ContaModel> buscarId(long codigo) {
        return contaRepository.findById(codigo);
    }

    public ContaModel cadastrar(ContaModel contaModel) {
        EfetuarTransferencia efetuarTransferencia = new EfetuarTransferencia();
        BigDecimal valor = efetuarTransferencia.transferir(contaModel.getTipoDeServico()).transferir(contaModel);

        contaModel.getCodigo();
        contaModel.getNumeroDeConta();
        contaModel.getAgencia();
        contaModel.getNomeDoUsuario();
        contaModel.getValorAtualDaConta();
        contaModel.getValorFornecido();
        contaModel.setValorFinal(valor);
        return contaRepository.save(contaModel);
    }

    public ContaModel alterar(ContaModel contaModel) {
        EfetuarTransferencia efetuarTransferencia = new EfetuarTransferencia();
        BigDecimal valor = efetuarTransferencia.transferir(contaModel.getTipoDeServico()).transferir(contaModel);

        contaModel.getCodigo();
        contaModel.getNumeroDeConta();
        contaModel.getAgencia();
        contaModel.getNomeDoUsuario();
        contaModel.getValorAtualDaConta();
        contaModel.getValorFornecido();
        contaModel.setValorFinal(valor);

        return contaRepository.save(contaModel);
    }

    public void deletar(long codigo) {
        contaRepository.deleteById(codigo);
    }

}
