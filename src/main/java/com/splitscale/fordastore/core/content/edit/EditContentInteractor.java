package com.splitscale.fordastore.core.content.edit;

import java.io.IOException;

import com.splitscale.fordastore.core.content.Url;
import com.splitscale.fordastore.core.repositories.ContentRepository;

public class EditContentInteractor {
  ContentRepository repository;

  public Url updateContent(Url content) throws IOException {
    return repository.update(content);
  }
}
