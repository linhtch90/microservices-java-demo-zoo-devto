package com.microservices.tigerservice.controller;

import com.microservices.tigerservice.service.ClientToPantherService;
import com.microservices.tigerservice.service.RabbitMQSender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TigerController {
  private final RabbitTemplate rabbitTemplate = new RabbitTemplate();  
  
  @Autowired
  private RabbitMQSender rabbitMqSender;
  
  @Autowired
  private ClientToPantherService clientToPantherService;

  @GetMapping("/tiger/callpantherservice")
  ResponseEntity<String> callPantherService() {
    return clientToPantherService.tigerCallPanther();
  }


  @GetMapping("/tiger/sendmessagetopanther")
  void sendMessageToPanther() {
    rabbitMqSender.send();
  }
}
