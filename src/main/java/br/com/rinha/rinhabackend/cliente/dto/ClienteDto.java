package br.com.rinha.rinhabackend.transacao.dto;

public class ClienteDto {

    private int limite;
    private int saldo;

    public ClienteDto(int limite, int saldo){
        this.limite = limite;
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public int getSaldo() {
        return saldo;
    }
}
