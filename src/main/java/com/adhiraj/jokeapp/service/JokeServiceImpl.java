package com.adhiraj.jokeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
@Primary
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  @Autowired
  public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
    this.chuckNorrisQuotes = chuckNorrisQuotes;
  }

  @Override
  public String getJoke() {
    System.out.println(chuckNorrisQuotes);
    return chuckNorrisQuotes.getRandomQuote();
  }

}
