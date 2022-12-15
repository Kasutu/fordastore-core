package com.splitscale.fordastore.core.container.read;

import java.io.IOException;
import java.util.List;

import com.splitscale.fordastore.core.container.Container;
import com.splitscale.fordastore.core.repositories.ContainerRepository;

public class ReadContainerInteractor {
  private ContainerRepository repository;

  public ReadContainerInteractor(ContainerRepository repository) {
    this.repository = repository;
  }

  public List<Container> readListByUid(String uid) throws IOException {
    return repository.getListByUid(uid);
  }

  public List<Container> readListByName(String name) throws IOException {
    return repository.getListByName(name);
  }

  public Container readByUid(String uid) throws IOException {
    return repository.getByUid(uid);
  }

  public Container getByContainerId(Long id) throws IOException {
    return repository.getByContainerID(id);
  }
}
