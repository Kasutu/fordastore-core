package com.splitscale.fordastore.core.url.edit;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UrlRepository;
import com.splitscale.fordastore.core.url.Url;

public class EditUrlInteractor {
  UrlRepository repository;

  public EditUrlInteractor(UrlRepository repository) {
    this.repository = repository;
  }

  public void updateUrl(Url url) throws IOException {
    repository.update(url.getInnerUrl(), url.getContainerID());
  }
}
