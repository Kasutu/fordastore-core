package com.splitscale.fordastore.core.content.edit;

import com.splitscale.fordastore.core.content.Content;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.repositories.ContentRepository;

public class EditContentInteractor {
  ContentRepository repository;

  public Content updateContent(Content content) throws ActionFailedException {
    return repository.update(content);
  }
}
