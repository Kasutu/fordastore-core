package com.splitscale.fordastore.core.url.read;

import java.io.IOException;
import java.util.List;

import com.splitscale.fordastore.core.repositories.UrlRepository;
import com.splitscale.fordastore.core.url.Url;

public class ReadUrlInteractor {
  UrlRepository repository;

  public ReadUrlInteractor(UrlRepository repository) {
    this.repository = repository;
  }

  public List<Url> getALLByContainerID(Long containerId) throws IOException {
    return repository.getALLByContainerID(containerId);
  }

  public Url getByUrlID(Long urlId) throws IOException {
    return repository.getByUrlID(urlId);
  }
}
