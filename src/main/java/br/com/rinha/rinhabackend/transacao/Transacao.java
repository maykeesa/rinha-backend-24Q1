package br.com.rinha.rinhabackend.transacao;

import br.com.rinha.rinhabackend.cliente.Cliente;
import br.com.rinha.rinhabackend.transacao.enums.TipoEnum;
import br.com.rinha.rinhabackend.transacao.form.TransacaoForm;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "transacoes")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Cliente cliente;
    private int valor;
    @Enumerated(EnumType.STRING)
    private TipoEnum tipo;
    @Size(min = 1, max = 10)
    private String descricao;
    @CreationTimestamp
    private LocalDateTime realizada_em;

    public Transacao(){

    }

    public Transacao(Cliente cliente, TransacaoForm form){
        this.cliente = cliente;
        this.valor = form.getValor();
        this.tipo = form.getTipo();
        this.descricao = form.getDescricao();
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
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

    public LocalDateTime getRealizada_em() {
        return realizada_em;
    }
}
