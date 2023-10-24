package br.com.ecommerce.producer;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrdemMain {
    public static void main (String[] args) throws ExecutionException, InterruptedException {
        try(var orderDispatcher = new KafkaDispatcher<Order>()) {
            try (var emailDispatcher = new KafkaDispatcher<Email>()) {
                var userId = UUID.randomUUID().toString();
                var orderId = UUID.randomUUID().toString();
                var amout = new BigDecimal(Math.random() * 5000 + 1);

                var order = new Order(userId, orderId, amout);
                orderDispatcher.send("ECOMMERCE_NEW_ORDEM", userId, order);

                var email = new Email("fernando.furtadocarrilho@gmail.com", "My Email");
                emailDispatcher.send("ECOMMERCE_SEND_EMAIL", userId, email);
            }
        }
    }


}
