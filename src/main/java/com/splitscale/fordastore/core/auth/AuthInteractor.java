package com.splitscale.fordastore.core.auth;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.AuthRepository;

public class AuthInteractor {
  AuthRepository repository;

  public AuthInteractor(AuthRepository repository) {
    this.repository = repository;
  }

  public boolean insertToken(PublicKey token) throws IOException {
    return repository.insert(token);
  }

  public boolean deleteToken(String uid) throws IOException {
    return repository.deleteByID(uid);
  }
}
