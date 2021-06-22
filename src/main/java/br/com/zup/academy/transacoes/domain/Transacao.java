package br.com.zup.academy.transacoes.domain;

import br.com.zupacademy.natalia.transacao.Cartao;
import br.com.zupacademy.natalia.transacao.Estabelecimento;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {

    @JsonProperty
    private String id;
    @JsonProperty
    private BigDecimal valor;
    @JsonProperty
    private Estabelecimento estabelecimento;
    @JsonProperty
    private Cartao cartao;
    @JsonProperty
    private LocalDateTime efetivadaEm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public void setEfetivadaEm(LocalDateTime efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }
}
