package br.com.zupacademy.natalia.transacao.entities;

import br.com.zupacademy.natalia.transacao.dto.Cartao;
import br.com.zupacademy.natalia.transacao.dto.Estabelecimento;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class TransacaoEntity {

    @Id
    @NotBlank
    private String id;
    private BigDecimal valor;
    @ManyToOne(cascade=CascadeType.ALL)
    private EstabelecimentoEntity estabelecimentoEntity;
    @ManyToOne(cascade= CascadeType.ALL)
    private CartaoEntity cartaoEntity;
    private LocalDateTime efetivadaEm = LocalDateTime.now();

    public TransacaoEntity() {
    }


    public TransacaoEntity(String id, BigDecimal valor, Estabelecimento estabelecimento,
                           Cartao cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimentoEntity = new EstabelecimentoEntity(estabelecimento);
        this.cartaoEntity = new CartaoEntity(cartao);
        this.efetivadaEm = efetivadaEm;
    }


    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoEntity getEstabelecimento() {
        return estabelecimentoEntity;
    }

    public CartaoEntity getCartao() {
        return cartaoEntity;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
