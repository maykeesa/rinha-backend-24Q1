package br.com.rinha.rinhabackend.transacao;

import br.com.rinha.rinhabackend.cliente.Cliente;
import br.com.rinha.rinhabackend.cliente.ClienteRepository;
import br.com.rinha.rinhabackend.transacao.form.TransacaoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransacaoService {

    @Autowired private ClienteRepository clienteRep;
    @Autowired private TransacaoRepository transacaoRep;

    public Optional<Cliente> transacao(Cliente cliente, TransacaoForm form) {
        int gastosTotais = form.getValor() + (cliente.getSaldo() * -1);

        if(cliente.getLimite() >= gastosTotais){
            cliente.setSaldo(-gastosTotais);
            this.transacaoRep.save(new Transacao(cliente, form));
            return Optional.of(this.clienteRep.saveAndFlush(cliente));
        }

        return Optional.empty();
    }
}
