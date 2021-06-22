package br.com.zupacademy.natalia.transacao.dto;

import javax.validation.constraints.NotBlank;

public class Estabelecimento {

    @NotBlank
    private String nome;
    @NotBlank
    private String cidade;
    @NotBlank
    private String endereco;


    public Estabelecimento() {
    }


    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }


}
