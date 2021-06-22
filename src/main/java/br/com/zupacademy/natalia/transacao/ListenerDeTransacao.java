package br.com.zupacademy.natalia.transacao;

import br.com.zup.academy.transacoes.domain.Transacao;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

        @KafkaListener(topics = "${spring.kafka.topic.transactions}", groupId = "${spring.kafka.consumer.group-id}")
        public void ouvir(Transacao eventoDeTransacao) {
            System.out.println(eventoDeTransacao);
        }
}
