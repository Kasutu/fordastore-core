package com.splitscale.fordastore.core.container.edit;

import com.splitscale.fordastore.core.container.Container;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectNotFoundException;
import com.splitscale.fordastore.core.repositories.ContainerRepository;

public class EditContainerInteractor {
  private ContainerRepository repository;

  public Container editContainer(Container container) throws ActionFailedException, ObjectNotFoundException {
    return repository.update(container);
  }
}
