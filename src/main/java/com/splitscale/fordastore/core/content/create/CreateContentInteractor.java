package com.splitscale.fordastore.core.content.create;

import com.splitscale.fordastore.core.content.Content;
import com.splitscale.fordastore.core.daos.ContentRepository;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectAlreadyExistException;

public class CreateContentInteractor {
  ContentRepository repository;

  public Content createContent(Content content) throws ObjectAlreadyExistException, ActionFailedException {
    return repository.add(content);
  }
}
