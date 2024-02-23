package br.com.rinha.rinhabackend.cliente;

import br.com.rinha.rinhabackend.cliente.dto.ClienteDto;
import br.com.rinha.rinhabackend.cliente.dto.ExtratoDto;
import br.com.rinha.rinhabackend.transacao.TransacaoService;
import br.com.rinha.rinhabackend.transacao.form.TransacaoForm;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired private ClienteService clienteService;
    @Autowired private TransacaoService transacaoService;

    @Autowired private ClienteRepository clienteRep;

    @GetMapping("/{id}/extrato")
    public ResponseEntity<ExtratoDto> getExtrato(@PathVariable int id){
        Optional<Cliente> clienteOpt = this.clienteRep.findById(id);

        if(clienteOpt.isPresent()){
            Cliente cliente = clienteOpt.get();
            ExtratoDto extratoDto = this.clienteService.getExtrato(cliente);
            return ResponseEntity.ok(extratoDto);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/{id}/transacoes")
    public ResponseEntity<ClienteDto> postTransacao(@PathVariable int id, @RequestBody @Valid TransacaoForm form){
        Optional<Cliente> clienteOpt = clienteRep.findById(id);

        if(clienteOpt.isPresent()){
            Optional<Cliente> clienteTransacao = this.transacaoService.transacao(clienteOpt.get(), form);

            if(clienteTransacao.isPresent()){
                Cliente cliente = clienteTransacao.get();
                return ResponseEntity.ok(new ClienteDto(cliente.getLimite(), cliente.getSaldo()));
            }else{
                return ResponseEntity.unprocessableEntity().build();
            }
        }

        return ResponseEntity.notFound().build();
    }
}
