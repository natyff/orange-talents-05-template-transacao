package br.com.zupacademy.natalia.transacao.dto;


import br.com.zupacademy.natalia.transacao.entities.CartaoEntity;

import javax.validation.constraints.NotBlank;

public class Cartao {

    @NotBlank
    private String id;
    @NotBlank
    private String email;

    public Cartao(CartaoEntity cartaoEntity) {
        this.id = cartaoEntity.getId();
        this.email = cartaoEntity.getEmail();
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public Cartao() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
