package br.com.rinha.rinhabackend.transacao.dto;

import br.com.rinha.rinhabackend.transacao.Transacao;
import br.com.rinha.rinhabackend.transacao.enums.TipoEnum;

import java.time.LocalDateTime;
import java.util.List;

public class TransacaoDto {

    private int valor;
    private TipoEnum tipo;
    private String descricao;
    private LocalDateTime realizadaEm;

    public TransacaoDto(Transacao transacao){
        this.valor = transacao.getValor();
        this.tipo = transacao.getTipo();
        this.descricao = transacao.getDescricao();
        this.realizadaEm = transacao.getRealizada_em();
    }

    public int getValor() {
        return valor;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getRealizadaEm() {
        return realizadaEm;
    }
}
