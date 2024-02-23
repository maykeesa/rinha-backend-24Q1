package br.com.rinha.rinhabackend.transacao.form;

import br.com.rinha.rinhabackend.transacao.enums.TipoEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TransacaoForm {

    private int valor;
    private String tipo;
    private TipoEnum descricao;
    @Size(min = 1, max = 10)
    public TransacaoForm(){

    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public TipoEnum getDescricao() {
        return descricao;
    }

}
