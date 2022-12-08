package com.splitscale.fordastore.core.authentication.register;

import com.splitscale.fordastore.core.authentication.SecurityService;
import com.splitscale.fordastore.core.authentication.User;
import com.splitscale.fordastore.core.authentication.UserBuilder;
import com.splitscale.fordastore.core.daos.UserRepository;
import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectAlreadyExistException;
import com.splitscale.fordastore.core.exceptions.ObjectNotFoundException;

public class RegisterInteractor {
  private UserRepository repository;
  private SecurityService security;

  public User registerUser(String username, String password)
      throws ActionFailedException, ObjectAlreadyExistException, ObjectNotFoundException {

    User user = repository.findByUsername(username);

    if (user != null) {
      throw new ObjectAlreadyExistException();
    }

    String encryptedPassword = security.encrypt(password);
    String uid = "UID_GEN_NOT_IMPLEMENTED";

    boolean isSuccess = repository.add(
        new UserBuilder(uid, username, encryptedPassword));

    if (!isSuccess) {
      throw new ActionFailedException();
    }

    User newUser = repository.findByUID(uid);

    if (newUser == null) {
      throw new ObjectNotFoundException();
    }

    return newUser;
  }
}
