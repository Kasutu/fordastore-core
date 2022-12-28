package com.splitscale.fordastore.core.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.fordastore.core.container.Container;
import com.splitscale.fordastore.core.container.ContainerRequest;

public interface ContainerRepository {
  public List<Container> getListByUid(String uid) throws IOException;

  public List<Container> getListByName(String name) throws IOException;

  public Container getByUid(String uid) throws IOException;

  public Container getByContainerID(long containerID) throws IOException;

  public void add(ContainerRequest container) throws IOException;

  public void update(Container container) throws IOException;

  public void delete(long containerID) throws IOException;
}
