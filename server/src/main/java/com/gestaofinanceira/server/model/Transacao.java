package com.gestaofinanceira.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; // Importação da anotação Entity para indicar que esta classe é uma entidade JPA
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal; // Importação da classe BigDecimal para representar valores monetários com precisão
import java.time.LocalDate;

@Entity
public class Transacao {
    
    @Id // Anotação para indicar que o campo 'id' é a chave primária da entidade
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; // Campo para armazenar o ID da transação

    private String descricao; // Campo para armazenar a descrição da transação
    private BigDecimal valor; // Campo para armazenar o valor da transação
    private LocalDate data; // Campo para armazenar a data da transação
    private String categoria; // Campo para armazenar a categoria da transação
    private String tipo; // Campo para armazenar o tipo da transação (receita ou despesa)

    // Getters e setters para os campos da transação
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
