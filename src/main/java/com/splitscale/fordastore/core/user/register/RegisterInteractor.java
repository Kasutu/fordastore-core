package com.splitscale.fordastore.core.user.register;

import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserRequest;

public class RegisterInteractor {
  private UserRepository repository;

  public User register(UserRequest user) throws Exception {
    return repository.add(user);
  }
}
