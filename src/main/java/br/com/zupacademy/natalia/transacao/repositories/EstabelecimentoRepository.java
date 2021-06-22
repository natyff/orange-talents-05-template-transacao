package br.com.zupacademy.natalia.transacao.repositories;

import br.com.zupacademy.natalia.transacao.entities.EstabelecimentoEntity;
import org.springframework.data.repository.CrudRepository;

public interface EstabelecimentoRepository extends CrudRepository<EstabelecimentoEntity, Long> {
}
