package com.gestaofinanceira.server.repository;

import com.gestaofinanceira.server.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    // Esta interface estende JpaRepository, o que fornece métodos CRUD para a entidade Transacao, criando os métodos de acesso aos dados como findAll(), findById(), save(), deleteById(), entre outros, sem a necessidade de implementação manual.
}
