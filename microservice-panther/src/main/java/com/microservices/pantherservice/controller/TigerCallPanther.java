package com.microservices.pantherservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TigerCallPanther {
  @GetMapping("/panther/tigercallpanther")
  ResponseEntity<String> tigerCallPanther() {
    return new ResponseEntity<String>("PANTHER RECEIVED CALL FROM TIGER", HttpStatus.OK);
  }
}
