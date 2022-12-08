package com.splitscale.fordastore.core.daos;

import java.util.List;

import com.splitscale.fordastore.core.content.Content;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectAlreadyExistException;

public interface ContentRepository {

  public List<Content> getALLByOwnerID(long ownerID);

  public Content getByContentID(long contentID);

  public Content add(Content container) throws ObjectAlreadyExistException, ActionFailedException;

  public Content update(Content container) throws ActionFailedException;

  public boolean delete(long containerID) throws ActionFailedException;
}
