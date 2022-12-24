package com.splitscale.fordastore.core.url.create;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UrlRepository;
import com.splitscale.fordastore.core.url.Url;

public class CreateUrlInteractor {
  UrlRepository repository;

  public CreateUrlInteractor(UrlRepository repository) {
    this.repository = repository;
  }

  public Url createContent(Url content) throws IOException {
    return repository.add(content);
  }
}
