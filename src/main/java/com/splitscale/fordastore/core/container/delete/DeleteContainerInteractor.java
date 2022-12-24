package com.splitscale.fordastore.core.container.delete;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.ContainerRepository;

public class DeleteContainerInteractor {
  private ContainerRepository repository;

  public DeleteContainerInteractor(ContainerRepository repository) {
    this.repository = repository;
  }

  public boolean deleteContainer(long containerID) throws IOException {
    return repository.delete(containerID);
  }
}
