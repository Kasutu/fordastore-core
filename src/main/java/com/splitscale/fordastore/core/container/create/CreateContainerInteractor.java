package com.splitscale.fordastore.core.container.create;

import java.io.IOException;

import com.splitscale.fordastore.core.container.Container;
import com.splitscale.fordastore.core.container.ContainerRequest;
import com.splitscale.fordastore.core.repositories.ContainerRepository;

public class CreateContainerInteractor {
  private ContainerRepository repository;

  public CreateContainerInteractor(ContainerRepository repository) {
    this.repository = repository;
  }

  public Container createContainer(ContainerRequest container) throws IOException {
    return repository.add(container);
  }
}
