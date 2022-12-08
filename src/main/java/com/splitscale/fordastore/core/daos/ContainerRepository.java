package com.splitscale.fordastore.core.daos;

import java.util.List;

import com.splitscale.fordastore.core.container.Container;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectAlreadyExistException;
import com.splitscale.fordastore.core.exceptions.ObjectNotFoundException;

public interface ContainerRepository {
  public List<Container> getByOwnerID(long ownerID);

  public Container getByContainerID(long containerID);

  public Container getByName(String name);

  public Container add(Container container) throws ObjectAlreadyExistException, ActionFailedException;

  public Container update(Container container) throws ActionFailedException, ObjectNotFoundException;

  public boolean delete(long containerID) throws ActionFailedException, ObjectNotFoundException;
}
