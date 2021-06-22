package br.com.zupacademy.natalia.transacao.entities;

import br.com.zupacademy.natalia.transacao.dto.Estabelecimento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EstabelecimentoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoEntity() {
    }

    public EstabelecimentoEntity(Long id, String nome, String cidade, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public EstabelecimentoEntity(Estabelecimento request){
        this.nome = request.getNome();
        this.cidade = request.getCidade();
        this.endereco = request.getEndereco();
    }

    public Long getId() {
        return id;
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
