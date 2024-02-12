package br.com.rinha.rinhabackend.transacao;

import br.com.rinha.rinhabackend.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {

    @Query("SELECT t FROM Transacao t WHERE t.cliente = :cliente ORDER BY t.realizada_em desc LIMIT 10")
    List<Transacao> getExtrato(Cliente cliente);
}
