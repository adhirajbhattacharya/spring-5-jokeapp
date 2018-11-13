package com.adhiraj.jokeapp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckNorrisConfig {

  @Bean
  @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public ChuckNorrisQuotes chuckNorrisQuotes() {
    System.out.println("Creating Bean ...");
    return new ChuckNorrisQuotes();
  }
}
