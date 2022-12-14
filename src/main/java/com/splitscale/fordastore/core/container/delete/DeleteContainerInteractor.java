package com.splitscale.fordastore.core.container.delete;

import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectNotFoundException;
import com.splitscale.fordastore.core.repositories.ContainerRepository;

public class DeleteContainerInteractor {
  private ContainerRepository repository;

  public boolean deleteContainer(long containerID) throws ActionFailedException, ObjectNotFoundException {
    return repository.delete(containerID);
  }
}
