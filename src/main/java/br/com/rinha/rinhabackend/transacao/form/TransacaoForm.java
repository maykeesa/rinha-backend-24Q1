package br.com.rinha.rinhabackend.transacao.form;

import br.com.rinha.rinhabackend.transacao.enums.TipoEnum;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class TransacaoForm {

    private int valor;
    private TipoEnum tipo;
    @Size(min = 1, max = 10) @Min(1) @Max(10)
    private String descricao;

    public TransacaoForm(){

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

}
