package com.gestaofinanceira.server.dto;
import java.math.BigDecimal;

public class SaldoDTO {
    private BigDecimal receitas;
    private BigDecimal despesas;
    private BigDecimal saldoTotal;

    public SaldoDTO(BigDecimal saldoTotal, BigDecimal despesas, BigDecimal receitas) {
        
        this.receitas = receitas;
        this.despesas = despesas;
        this.saldoTotal = receitas.subtract(despesas); // substract é um metodo do BigDecimal que serve para subtrair os valores
    }

    public BigDecimal getReceitas() {
        return receitas;
    }

    public BigDecimal getDespesas() {
        return despesas;
    }

    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }
}
