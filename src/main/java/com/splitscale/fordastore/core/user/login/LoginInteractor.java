package com.splitscale.fordastore.core.user.login;

import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectNotFoundException;
import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.security.EncryptionService;
import com.splitscale.fordastore.core.user.User;

public class LoginInteractor {
  private UserRepository repository;
  private EncryptionService security;

  public User login(String username, String password)
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
