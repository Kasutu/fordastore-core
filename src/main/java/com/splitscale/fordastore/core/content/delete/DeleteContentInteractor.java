package com.splitscale.fordastore.core.content.delete;

import com.splitscale.fordastore.core.daos.ContentRepository;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;

public class DeleteContentInteractor {
  ContentRepository repository;

  public boolean deleteContentById(long id) throws ActionFailedException {
    return repository.delete(id);
  }

}
