package com.splitscale.fordastore.core.content.delete;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.ContentRepository;

public class DeleteContentInteractor {
  ContentRepository repository;

  public boolean deleteContentById(long id) throws IOException {
    return repository.delete(id);
  }

}
