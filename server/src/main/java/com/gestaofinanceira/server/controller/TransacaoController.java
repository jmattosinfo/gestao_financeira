package com.gestaofinanceira.server.controller;

import java.util.List; // Importação da classe List para trabalhar
import com.gestaofinanceira.server.model.Transacao;
import com.gestaofinanceira.server.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired; // Importação da anotação Autowired para injetar a dependência do repositório de transações
import org.springframework.web.bind.annotation.*; // Importação das anotações para criar um controlador REST, como RestController, RequestMapping, GetMapping, PostMapping, PutMapping e DeleteMapping


@RestController // o restController indica que essa classe é um controlador REST, ou seja, ela vai lidar com requisições HTTP e retornar respostas em formato JSON ou XML.
@RequestMapping("/api/transacoes")
public class TransacaoController {
    @Autowired // A anotação Autowired é usada para injetar automaticamente a dependência do TransacaoRepository, permitindo que o controlador acesse os métodos de acesso aos dados sem precisar instanciar o repositório manualmente.
    private TransacaoRepository repository;

    // Listar todas as transações
    @GetMapping // O GetMapping indica que esse endpoint recebe requisições GET e retorna uma lista de transações.
    public List<Transacao> listar() {
        return repository.findAll(); // O método findAll() do repositório é chamado para obter todas as transações do banco de dados e retorná-las como resposta.
    }

    // Salvar uma nova transação
    @PostMapping // O PostMapping indica que esse endpoint recebe requisições POST para criar uma nova transação.
    public Transacao salvar(@RequestBody Transacao transacao) {
        return repository.save(transacao);
    }

    // Deletar uma transação por ID
    @DeleteMapping("/{id}") // O DeleteMapping indica que esse endpoint recebe requisições DELETE para excluir uma transação específica, identificada pelo ID passado na URL.
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
