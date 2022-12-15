package com.splitscale.fordastore.core.url.delete;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UrlRepository;

public class DeleteUrlInteractor {
  UrlRepository repository;

  public boolean deleteContentById(long id) throws IOException {
    return repository.delete(id);
  }

}
