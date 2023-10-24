## 💻 Sobre o projeto

Ecommerce é um projeto de mensageria na linguagem Java e com uso do Kafka em que há Produceres, Consumers e Streamers.

---

## ⚙️ Funcionalidades

- [x] Producer;
- [x] Consumer;
- [x] Broker;
- [x] Topics;

---

## :1st_place_medal: Envolvimento do projeto
- [x] Criação de um producer;
- [x] Criação de um consumer;
- [x] Criação de tópicos;
- [x] Comunicação entre producers e Consumers;
--- 

## 🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento do projeto:

- **[Java 17](https://www.oracle.com/java)**
- **[Kafka](https://spring.io/projects/spring-boot)**
- **[Maven](https://maven.apache.org)**
- **[Slf4j](https://www.mysql.com)**

---

## 📝 Licença

  Estrutura do projeto desenhada pela [Alura](https://www.alura.com.br) e construído por [Fernando Furtado](https://github.com/Fernando-EngComputacao/) . 

---
## :bookmark: Certificação
° Certificado do Curso: **[KAFKA: PRODUTORES, CONSUMIDORES E STREAMS](https://cursos.alura.com.br/certificate/b088d2b4-9882-4288-afbe-ac854ea47ca6)**

---

## :arrows_clockwise: Adicionais:
#### Command Line Usage
###### - Código para producer:

    bin/kafka-console-producer.sh --broker-list localhost:9092 --topic LOJA_NOVO_PEDIDO

###### - Código para consumer:

     bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic LOJA_NOVO_PEDIDO --from-beginning

###### - Código para ver tópico:

     bin/kafka-topics.sh --list --bootstrap-server localhost:9092 LOJA_NOVO_PEDIDO
___