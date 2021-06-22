package br.com.zupacademy.natalia.transacao;

import br.com.zup.academy.transacoes.domain.Transacao;
import br.com.zupacademy.natalia.transacao.entities.TransacaoEntity;
import br.com.zupacademy.natalia.transacao.repositories.CartaoRepository;
import br.com.zupacademy.natalia.transacao.repositories.TransacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    TransacoesRepository transacoesRepository;

    @Autowired
    CartaoRepository cartaoRepository;

        @KafkaListener(topics = "${spring.kafka.topic.transactions}", groupId = "${spring.kafka.consumer.group-id}")
        public void ouvir(Transacao eventoDeTransacao) {
            TransacaoEntity transacao = eventoDeTransacao.converter();
            transacoesRepository.save(transacao);

            System.out.println(eventoDeTransacao);
        }
}
