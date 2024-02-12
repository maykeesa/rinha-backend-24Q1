package br.com.rinha.rinhabackend.cliente.dto;

public class ClienteDto {
    //teste aa
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
