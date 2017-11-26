package udea.Mercadolibre.mercadolibre.RabbitConf;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by David on 25/11/2017.
 */
@Configuration
public class RabbitConf {

  @Bean
  public ConnectionFactory connectionFactory(){
    CachingConnectionFactory connectionFactory = new CachingConnectionFactory("elephant.rmq.cloudamqp.com");
    connectionFactory.setUsername("xjlvzwua");
    connectionFactory.setPassword("iwFGaunB2giYAvCn8jgugRHb-RHJXpo8");
    connectionFactory.setVirtualHost("xjlvzwua");
    connectionFactory.setChannelCheckoutTimeout(10000);
    connectionFactory.setRequestedHeartBeat(30);
    return connectionFactory;
  }

  @Bean
  public SimpleMessageListenerContainer container(ConnectionFactory connectionFactory) {
    SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
    container.setConnectionFactory(connectionFactory);
    container.setQueueNames("udea.regalos.amazon.regalovendido");
    container.setMessageListener(new Consumidor());
    container.setAcknowledgeMode(AcknowledgeMode.AUTO);
    return container;
  }

}
