package br.com.zupacademy.natalia.transacao.entities;

import br.com.zupacademy.natalia.transacao.dto.Cartao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartaoEntity {

    @Id
    private String id;
    private String email;


    public CartaoEntity(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public CartaoEntity() {
    }

    public CartaoEntity(Cartao cartao) {
        this.id = cartao.getId();
        this.email = cartao.getEmail();
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
