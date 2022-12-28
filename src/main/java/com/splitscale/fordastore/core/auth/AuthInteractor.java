package com.splitscale.fordastore.core.auth;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.AuthRepository;

public class AuthInteractor {
  AuthRepository repository;

  public AuthInteractor(AuthRepository repository) {
    this.repository = repository;
  }

  public void insertToken(AuthPublicKey token) throws IOException {
    repository.insert(token);
  }

  public void deleteToken(String uid) throws IOException {
    repository.deleteByUid(uid);
  }

  public AuthPublicKey getTokenByUid(String uid) throws IOException {
    return repository.getByUid(uid);
  }

  public void deleteTokenByUid(String uid) throws IOException {
    repository.deleteByUid(uid);
  }
}
