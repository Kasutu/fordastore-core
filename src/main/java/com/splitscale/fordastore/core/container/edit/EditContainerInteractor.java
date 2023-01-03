package com.splitscale.fordastore.core.container.edit;

import java.io.IOException;

import com.splitscale.fordastore.core.container.Container;
import com.splitscale.fordastore.core.repositories.ContainerRepository;

public class EditContainerInteractor {
  private ContainerRepository repository;

  public EditContainerInteractor(ContainerRepository repository) {
    this.repository = repository;
  }

  public void editContainer(Container container) throws IOException {
    repository.update(container.getName(), container.getContainerID());
  }
}
