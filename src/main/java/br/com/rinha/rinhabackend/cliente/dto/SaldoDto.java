package br.com.rinha.rinhabackend.cliente.dto;

import br.com.rinha.rinhabackend.cliente.Cliente;

import java.time.LocalDateTime;

public class SaldoDto {

    private int total;
    private LocalDateTime dataExtrato;
    private int limite;

    public SaldoDto(Cliente cliente){
        this.total = cliente.getSaldo();
        this.dataExtrato = LocalDateTime.now();
        this.limite = cliente.getLimite();
    }

    public int getTotal() {
        return total;
    }

    public LocalDateTime getDataExtrato() {
        return dataExtrato;
    }

    public int getLimite() {
        return limite;
    }
}
