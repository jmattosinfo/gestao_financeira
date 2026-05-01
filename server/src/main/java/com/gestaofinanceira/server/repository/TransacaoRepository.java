package com.gestaofinanceira.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaofinanceira.server.model.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    // Esta interface estende JpaRepository, o que fornece métodos CRUD para a 
    // entidade Transacao, criando os métodos de acesso aos dados como findAll(), 
    // findById(), save(), deleteById(), entre outros, sem a necessidade de implementação manual.

    //O JpaRepository serve para facilitar a interação com o banco de dados, permitindo 
    // que o controlador de transações se concentre na logica de negócio e na manipulação dos dados, 
    // sem a necessidade de implementação manual que o controlador precisaria fazer para acessar o banco de dados.
    // 
    //Com o JpaRepository, o controlador pode simplesmente chamar os métodos fornecidos pelo repositório 
    // para realizar operações de acesso aos dados, como listar todas as transações, salvar uma 
    // nova transação ou deletar uma transação por ID, sem se preocupar com a implementação dos 
    // métodos de detalhes de acesso ao banco de dados.
    
    // Isso facilita a interação com o banco de dados, permitindo que o controlador 
    // e outros componentes da aplicação possam acessar e manipular os dados de 
    // transações de forma simples e eficiente.
}
