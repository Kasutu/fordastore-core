package com.splitscale.fordastore.core.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.fordastore.core.url.Url;

public interface UrlRepository {

  public List<Url> getALLByContainerID(long containerID) throws IOException;

  public Url getByUrlID(long urlID) throws IOException;

  public Url add(String innerUrl, Long containerId) throws IOException;

  public void update(String innerUrl, Long urlId) throws IOException;

  public void deleteByUrlId(long urlID) throws IOException;
}
