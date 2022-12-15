package com.splitscale.fordastore.core.repositories;

import java.io.IOException;

import com.splitscale.fordastore.core.auth.PublicKey;

public interface AuthRepository {
  public PublicKey getByID(String uid) throws IOException;

  public boolean insert(PublicKey token) throws IOException;

  public boolean update(PublicKey token) throws IOException;

  public boolean deleteByID(String uid) throws IOException;

}
