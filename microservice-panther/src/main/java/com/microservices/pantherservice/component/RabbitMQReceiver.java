package com.microservices.pantherservice.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQReceiver implements RabbitListenerConfigurer {
  private static final Logger logger = LoggerFactory.getLogger(RabbitMQReceiver.class);

  @Override
  public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {
  }

  @RabbitListener(queues = "${spring.rabbitmq.queue}")
  public void receivedMessage(String message) {
    logger.info("Received message is: " + message);
  }
}