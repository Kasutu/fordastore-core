package com.splitscale.fordastore.core.user.register;

import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.security.EncryptionService;
import com.splitscale.fordastore.core.user.UserRequest;

public class RegisterInteractor {
  private UserRepository repository;
  private EncryptionService security;

  public UserClaims register(UserRequest user) throws Exception {
    String hashedPassword = security.encrypt(user.getPassword());

    user.setPassword(hashedPassword);

    return repository.add(user);
  }
}
