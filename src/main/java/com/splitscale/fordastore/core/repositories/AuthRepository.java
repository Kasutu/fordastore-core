package com.splitscale.fordastore.core.repositories;

import java.io.IOException;

import com.splitscale.fordastore.core.auth.AuthPublicKey;

public interface AuthRepository {
  public AuthPublicKey getByUid(String uid) throws IOException;

  public void insert(AuthPublicKey token) throws IOException;

  public void update(AuthPublicKey token) throws IOException;

  public void deleteByUid(String uid) throws IOException;

}
