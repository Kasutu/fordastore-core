package com.splitscale.fordastore.core.repositories;

import java.security.PublicKey;

import com.splitscale.fordastore.core.session.Token;

public interface SessionRepository {
  public PublicKey getByID(String id);

  public boolean insert(Token token);

  public boolean update(Token token);

  public boolean deleteByID(Long id);

}
