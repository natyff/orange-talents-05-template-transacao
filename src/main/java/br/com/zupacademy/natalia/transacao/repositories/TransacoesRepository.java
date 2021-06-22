package br.com.zupacademy.natalia.transacao.repositories;

import br.com.zupacademy.natalia.transacao.entities.TransacaoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface TransacoesRepository extends CrudRepository<TransacaoEntity, String> {

    Page<TransacaoEntity> findAll(Pageable paginacao);
}
