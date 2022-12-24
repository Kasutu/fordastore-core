package com.splitscale.fordastore.core.user.register;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserRequest;

public class RegisterInteractor {
  private UserRepository repository;

  public RegisterInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public User register(UserRequest user) throws IOException {
    return repository.add(user);
  }
}
