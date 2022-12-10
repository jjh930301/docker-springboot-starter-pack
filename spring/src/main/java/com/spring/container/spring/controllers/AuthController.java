package com.spring.container.spring.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("")
public class AuthController {

  @GetMapping("test")
  public ResponseEntity<String> test() {
    return ResponseEntity
      .status(HttpStatus.ACCEPTED)
      .body("test");
  }
}
