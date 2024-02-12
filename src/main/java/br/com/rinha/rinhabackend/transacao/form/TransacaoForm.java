package br.com.rinha.rinhabackend.cliente.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TransacaoForm {

    @NotNull
    private int valor;
    @NotBlank
    private String tipo;
    @NotBlank
    private String descricao;

    public TransacaoForm(){

    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

}
