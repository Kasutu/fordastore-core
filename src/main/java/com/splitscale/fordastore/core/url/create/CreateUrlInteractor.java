package com.splitscale.fordastore.core.url.create;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UrlRepository;
import com.splitscale.fordastore.core.url.UrlRequest;

public class CreateUrlInteractor {
  UrlRepository repository;

  public CreateUrlInteractor(UrlRepository repository) {
    this.repository = repository;
  }

  public void createContent(UrlRequest content) throws IOException {
    repository.add(content);
  }
}
