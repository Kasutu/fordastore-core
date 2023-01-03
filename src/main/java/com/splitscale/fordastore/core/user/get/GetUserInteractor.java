package com.splitscale.fordastore.core.user.get;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.user.User;

public class GetUserInteractor {
  private UserRepository repository;

  public GetUserInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public User getByUsername(String username) throws IOException {
    return repository.findByUsername(username);
  }
}
