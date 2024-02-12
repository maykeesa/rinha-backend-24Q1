package br.com.rinha.rinhabackend.cliente;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int limite;
    private int saldo;

    public Cliente(){

    }

    public Cliente (int limite, int saldo){
        this.limite = limite;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public int getLimite() {
        return limite;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
