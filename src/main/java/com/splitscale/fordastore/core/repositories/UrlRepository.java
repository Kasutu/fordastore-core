package com.splitscale.fordastore.core.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.fordastore.core.url.Url;

public interface UrlRepository {

  public List<Url> getALLByOwnerID(long ownerID) throws IOException;

  public Url getByContentID(long contentID) throws IOException;

  public Url add(Url container) throws IOException;

  public Url update(Url container) throws IOException;

  public boolean delete(long containerID) throws IOException;
}
