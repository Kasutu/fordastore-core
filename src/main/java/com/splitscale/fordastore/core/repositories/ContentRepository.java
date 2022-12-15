package com.splitscale.fordastore.core.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.fordastore.core.content.Url;

public interface ContentRepository {

  public List<Url> getALLByOwnerID(long ownerID) throws IOException;

  public Url getByContentID(long contentID) throws IOException;

  public Url add(Url container) throws IOException;

  public Url update(Url container) throws IOException;

  public boolean delete(long containerID) throws IOException;
}
