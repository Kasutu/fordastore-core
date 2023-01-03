package com.splitscale.fordastore.core.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.fordastore.core.container.Container;

public interface ContainerRepository {
  public List<Container> getListByUid(String uid) throws IOException;

  public List<Container> getListByName(String name) throws IOException;

  public Container getByUid(String uid) throws IOException;

  public Container getByContainerID(long containerID) throws IOException;

  public Container add(String containerName, String uid) throws IOException;

  public void update(String containerName, Long containerId) throws IOException;

  public void delete(Long containerId) throws IOException;
}
