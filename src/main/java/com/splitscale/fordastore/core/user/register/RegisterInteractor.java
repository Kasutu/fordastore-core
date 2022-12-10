package com.splitscale.fordastore.core.user.register;

import java.util.UUID;

import com.splitscale.fordastore.core.exceptions.ActionFailedException;
import com.splitscale.fordastore.core.exceptions.ObjectAlreadyExistException;
import com.splitscale.fordastore.core.repositories.UserRepository;
import com.splitscale.fordastore.core.security.EncryptionService;
import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserBuilder;

public class RegisterInteractor {
  private UserRepository repository;
  private EncryptionService security;

  public String register(String username, String password)
      throws ActionFailedException, ObjectAlreadyExistException {

    User user = repository.findByUsername(username);

    if (user != null) {
      throw new ObjectAlreadyExistException();
    }

    String encryptedPassword = security.encrypt(password);
    String uid = UUID.randomUUID().toString();

    boolean isSuccess = repository.add(
        new UserBuilder(uid, username, encryptedPassword));

    if (!isSuccess) {
      throw new ActionFailedException();
    }

    return uid;
  }
}
