package com.splitscale.fordastore.core.url.create;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UrlRepository;
import com.splitscale.fordastore.core.url.Url;
import com.splitscale.fordastore.core.url.UrlRequest;

public class CreateUrlInteractor {
  UrlRepository repository;

  public CreateUrlInteractor(UrlRepository repository) {
    this.repository = repository;
  }

  public Url createUrl(UrlRequest url) throws IOException {
    return repository.add(url.getInnerUrl(), url.getContainerID());
  }
}
