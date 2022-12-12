package com.splitscale.fordastore.core.user.login;

import com.splitscale.fordastore.core.exceptions.AuthenticationFailedException;
import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.security.EncryptionService;
import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserRequest;

public class LoginInteractor {
  private UserRepository repository;
  private EncryptionService security;

  public User login(UserRequest userRequest) throws Exception {

    User user = repository.findByUsername(userRequest.getUsername());
    boolean isAuthenticated = security.verify(userRequest.getPassword(), user.getPassword());

    if (!isAuthenticated) {
      throw new AuthenticationFailedException("Invalid username or password");
    }

    return user;
  }
}
