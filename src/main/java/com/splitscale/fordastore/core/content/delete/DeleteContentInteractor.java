package com.splitscale.fordastore.core.content.delete;

import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.repositories.ContentRepository;

public class DeleteContentInteractor {
  ContentRepository repository;

  public boolean deleteContentById(long id) throws ActionFailedException {
    return repository.delete(id);
  }

}
