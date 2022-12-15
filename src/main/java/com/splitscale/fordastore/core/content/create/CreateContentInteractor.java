package com.splitscale.fordastore.core.content.create;

import java.io.IOException;

import com.splitscale.fordastore.core.content.Url;
import com.splitscale.fordastore.core.repositories.ContentRepository;

public class CreateContentInteractor {
  ContentRepository repository;

  public Url createContent(Url content) throws IOException {
    return repository.add(content);
  }
}
