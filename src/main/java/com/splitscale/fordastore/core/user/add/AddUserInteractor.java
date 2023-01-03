package com.splitscale.fordastore.core.user.add;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserRequest;

public class AddUserInteractor {
  private UserRepository repository;

  public AddUserInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public User add(UserRequest userRequest) throws IOException {
    return repository.add(userRequest.getUsername(), userRequest.getPassword());
  }
}
