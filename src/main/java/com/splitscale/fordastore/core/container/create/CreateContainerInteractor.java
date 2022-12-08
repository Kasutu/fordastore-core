package com.splitscale.fordastore.core.container.create;

import com.splitscale.fordastore.core.container.Container;
import com.splitscale.fordastore.core.container.ContainerBuilder;
import com.splitscale.fordastore.core.daos.ContainerRepository;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectAlreadyExistException;

public class CreateContainerInteractor {
  private ContainerRepository repository;

  public Container createContainer(String name, long ownerID)
      throws ObjectAlreadyExistException, ActionFailedException {

    return repository.add(new ContainerBuilder(name, ownerID));
  }
}
