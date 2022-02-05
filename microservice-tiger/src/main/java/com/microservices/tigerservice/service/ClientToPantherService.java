package com.microservices.tigerservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("panther-service")
public interface ClientToPantherService {
  @GetMapping("/panther/tigercallpanther")
  ResponseEntity<String> tigerCallPanther();
}
