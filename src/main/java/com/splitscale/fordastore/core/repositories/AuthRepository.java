package com.splitscale.fordastore.core.repositories;

import com.splitscale.fordastore.core.auth.PublicKey;

public interface AuthRepository {
  public PublicKey getByID(String uid);

  public boolean insert(PublicKey token);

  public boolean update(PublicKey token);

  public boolean deleteByID(String uid);

}
