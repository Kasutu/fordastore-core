package com.splitscale.fordastore.core.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.fordastore.core.url.Url;
import com.splitscale.fordastore.core.url.UrlRequest;

public interface UrlRepository {

  public List<Url> getALLByContainerID(long containerID) throws IOException;

  public Url getByUrlID(long urlID) throws IOException;

  public void add(UrlRequest url) throws IOException;

  public void update(Url url) throws IOException;

  public void delete(long urlID) throws IOException;
}
