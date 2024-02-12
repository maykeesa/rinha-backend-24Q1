package br.com.rinha.rinhabackend.cliente.dto;

import br.com.rinha.rinhabackend.cliente.Cliente;
import br.com.rinha.rinhabackend.transacao.Transacao;
import br.com.rinha.rinhabackend.transacao.dto.TransacaoDto;

import java.util.ArrayList;
import java.util.List;

public class ExtratoDto {

    private SaldoDto saldo;
    private List<TransacaoDto> ultimasTransacoes;

    public ExtratoDto(Cliente cliente, List<Transacao> ultimasTransicoes){
        this.saldo = new SaldoDto(cliente);
        this.ultimasTransacoes = this.converter(ultimasTransicoes);
    }

    public List<TransacaoDto> converter(List<Transacao> transacoes){
        List<TransacaoDto> transacaoDto = new ArrayList<>();
        transacoes.forEach(t -> transacaoDto.add(new TransacaoDto(t)));
        return transacaoDto;
    }

    public SaldoDto getSaldo() {
        return saldo;
    }

    public List<TransacaoDto> getUltimasTransacoes() {
        return ultimasTransacoes;
    }
}
