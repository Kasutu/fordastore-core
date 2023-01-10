package com.splitscale.fordastore.core.container.edit;

import java.io.IOException;

import com.splitscale.fordastore.core.container.ContainerRequest;
import com.splitscale.fordastore.core.repositories.ContainerRepository;

public class EditContainerInteractor {
  private ContainerRepository repository;

  public EditContainerInteractor(ContainerRepository repository) {
    this.repository = repository;
  }

  public void editContainer(ContainerRequest containerRequest, Long containerId) throws IOException {
    repository.update(containerRequest.getName(), containerId);
  }
}
