package com.adhiraj.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @ImportResource("classpath:chuck-norris-config.xml")
public class JokeappApplication {

  public static void main(String[] args) {
    SpringApplication.run(JokeappApplication.class, args);
  }
}
