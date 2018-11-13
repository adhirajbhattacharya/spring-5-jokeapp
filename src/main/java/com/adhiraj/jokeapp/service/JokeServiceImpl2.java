package com.adhiraj.jokeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl2 implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  @Autowired
  public JokeServiceImpl2(ChuckNorrisQuotes chuckNorrisQuotes) {
    this.chuckNorrisQuotes = chuckNorrisQuotes;
  }

  @Override
  public String getJoke() {
    System.out.println(chuckNorrisQuotes);
    return chuckNorrisQuotes.getRandomQuote();
  }

}
