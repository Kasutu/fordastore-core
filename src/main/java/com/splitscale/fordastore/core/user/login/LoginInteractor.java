package com.splitscale.fordastore.core.user.login;

import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserRequest;

public class LoginInteractor {
  private UserRepository repository;

  public User login(UserRequest userRequest) throws Exception {
    return repository.findByUsername(userRequest.getUsername());
  }
}
