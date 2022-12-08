package com.splitscale.fordastore.core.container.delete;

import com.splitscale.fordastore.core.daos.ContainerRepository;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectNotFoundException;

public class DeleteContainerInteractor {
  private ContainerRepository repository;

  public boolean deleteContainer(long containerID) throws ActionFailedException, ObjectNotFoundException {
    return repository.delete(containerID);
  }
}
