package com.splitscale.fordastore.core.url.read;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UrlRepository;

public class ReadUrlInteractor {
  UrlRepository repository;

  public ReadUrlInteractor(UrlRepository repository) {
    this.repository = repository;
  }

  public void getALLByContainerID(Long containerId) throws IOException {
    repository.getALLByContainerID(containerId);
  }

  public void getByUrlID(Long urlId) throws IOException {
    repository.getByUrlID(urlId);
  }
}
