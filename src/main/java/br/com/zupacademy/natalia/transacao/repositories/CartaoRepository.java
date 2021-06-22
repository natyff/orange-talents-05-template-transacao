package br.com.zupacademy.natalia.transacao.repositories;

import br.com.zupacademy.natalia.transacao.entities.CartaoEntity;
import org.springframework.data.repository.CrudRepository;

public interface CartaoRepository extends CrudRepository<CartaoEntity, String> {
}
