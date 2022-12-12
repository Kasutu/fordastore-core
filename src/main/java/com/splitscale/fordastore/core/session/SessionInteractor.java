package com.splitscale.fordastore.core.session;

import com.splitscale.fordastore.core.repositories.SessionRepository;

public class SessionInteractor {
  SessionRepository repository;

  public boolean insertToken(Token token) {
    // check if exist
    return repository.insert(token);
  }

  public boolean updateToken(Token token) {
    // direct update
    return repository.update(token);
  }

  public boolean deleteToken(Long id) {
    // direct delete
    return repository.deleteByID(id);
  }
}
