package com.gestaofinanceira.server;

import com.gestaofinanceira.server.model.Transacao;
import com.gestaofinanceira.server.repository.TransacaoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;

import java.util.List;

@Configuration
// Classe de configuração para criar dados fictícios (dummy data) para testes ou desenvolvimento
public class DummyDataConfig {
    @Bean // Anotação para indicar que este método retorna um bean gerenciado pelo Spring, neste caso, um CommandLineRunner que será executado na inicialização da aplicação
    public CommandLineRunner loadData(TransacaoRepository repository) {
        return (args) -> {
            Transacao t1 = new Transacao();
            t1.setDescricao("Salário");
            t1.setValor(new BigDecimal("5000.00"));
            t1.setData(LocalDate.now());
            t1.setCategoria("Renda");
            t1.setTipo("RECEITA");

            Transacao t2 = new Transacao();
            t2.setDescricao("Aluguel");
            t2.setValor(new BigDecimal("1500.00"));
            t2.setData(LocalDate.now());
            t2.setCategoria("Moradia");
            t2.setTipo("DESPESA");

            repository.saveAll(List.of(t1, t2)); // Salva as transações criadas no banco de dados usando o repositório
            System.out.println("Dados fictícios carregados com sucesso!"); // Imprime uma mensagem no console para indicar que os dados foram carregados
        };
    }

}
