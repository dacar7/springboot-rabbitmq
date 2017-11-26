package udea.Mercadolibre.mercadolibre.RabbitConf;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by David on 25/11/2017.
 */
@Component
public class Consumidor implements MessageListener {
  @Override
  public void onMessage(Message message) {
    System.out.println(new String(message.getBody()));
  }

}
