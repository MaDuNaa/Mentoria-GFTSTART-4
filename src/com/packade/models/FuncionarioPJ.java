package com.packade.models;

import com.packade.models.Endereco;

public  abstract class  FuncionarioPJ {
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double ValorHora;
    private Double ValorRemuneracao;

    public void calculaRemuneracao() {
        this.ValorRemuneracao = this.horasTrabalhadas * this.ValorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(Double valorHora) {
        ValorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return ValorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        ValorRemuneracao = valorRemuneracao;
    }

}
