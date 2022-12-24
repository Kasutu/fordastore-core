package com.splitscale.fordastore.core.url.edit;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UrlRepository;
import com.splitscale.fordastore.core.url.Url;

public class EditUrlInteractor {
  UrlRepository repository;

  public EditUrlInteractor(UrlRepository repository) {
    this.repository = repository;
  }

  public Url updateContent(Url content) throws IOException {
    return repository.update(content);
  }
}
