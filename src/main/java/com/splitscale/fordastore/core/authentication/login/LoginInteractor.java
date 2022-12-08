package com.splitscale.fordastore.core.authentication.login;

import com.splitscale.fordastore.core.authentication.SecurityService;
import com.splitscale.fordastore.core.authentication.User;
import com.splitscale.fordastore.core.daos.UserRepository;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectNotFoundException;

public class LoginInteractor {
  private UserRepository repository;
  private SecurityService security;

  public User authenticate(String username, String password)
      throws ObjectNotFoundException, ActionFailedException {

    User user = repository.findByUsername(username);

    if (user == null) {
      throw new ObjectNotFoundException();
    }

    if (security.compareEncryption(password, user.getPassword())) {
      throw new ActionFailedException();
    }

    return user;
  }
}
