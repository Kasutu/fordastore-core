package com.splitscale.fordastore.core.repositories;

import java.security.PublicKey;

public interface SessionRepository {
  public PublicKey getByUID(String id);

  public boolean insert(PublicKey publicKey, String uid);
}
