package br.com.rinha.rinhabackend.cliente;

import br.com.rinha.rinhabackend.cliente.dto.ExtratoDto;
import br.com.rinha.rinhabackend.transacao.Transacao;
import br.com.rinha.rinhabackend.transacao.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired private ClienteRepository clienteRep;
    @Autowired private TransacaoRepository transacaoRep;

    public ExtratoDto getExtrato(Cliente cliente){
        List<Transacao> extrato = this.transacaoRep.getExtrato(cliente);

        return new ExtratoDto(cliente, extrato);
    }

}
