package com.splitscale.fordastore.core.content.edit;

import com.splitscale.fordastore.core.content.Content;
import com.splitscale.fordastore.core.daos.ContentRepository;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;

public class EditContentInteractor {
  ContentRepository repository;

  public Content updateContent(Content content) throws ActionFailedException {
    return repository.update(content);
  }
}
