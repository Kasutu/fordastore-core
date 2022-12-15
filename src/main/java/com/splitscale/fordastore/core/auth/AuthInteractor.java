package com.splitscale.fordastore.core.auth;

import com.splitscale.fordastore.core.repositories.AuthRepository;

public class AuthInteractor {
  AuthRepository repository;

  public AuthInteractor(AuthRepository repository) {
    this.repository = repository;
  }

  public boolean insertToken(PublicKey token) {
    return repository.insert(token);
  }

  public boolean deleteToken(String uid) {
    return repository.deleteByID(uid);
  }
}
