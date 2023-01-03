package com.splitscale.fordastore.core.user.login;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserRequest;

public class LoginInteractor {
  private UserRepository repository;

  public LoginInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public User login(UserRequest userRequest) throws IOException {
    return repository.findByUsername(userRequest.getUsername());
  }
}
