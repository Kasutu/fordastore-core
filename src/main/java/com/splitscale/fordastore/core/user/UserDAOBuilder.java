package com.splitscale.fordastore.core.user;

import com.splitscale.fordastore.core.auth.TokenizedBasicAuth;
import com.splitscale.fordastore.core.database.DatabaseService;

public class UserDAOBuilder implements UserDAO {
  DatabaseService databaseService;

  public UserDAOBuilder(DatabaseService databaseService) {
    this.databaseService = databaseService;
  }

  @Override
  public User getUserByUID(String uid) {
    return new UserBuilder("some UID", "someUsername", "somePassword");
  }

  @Override
  public User createUser(String username, String password) {
    return new UserBuilder("someUID", username, password);
  }

  @Override
  public User getUserByUsername(String username) {
    return new UserBuilder("someUID", username, "some pwd");
  }

  @Override
  public User getUserById(long id) {
    return new UserBuilder("some UID", "username", "password");
  }

  @Override
  public boolean updateUser(TokenizedBasicAuth auth, User newUser) {
    return true;
  }

  @Override
  public boolean deleteUser(TokenizedBasicAuth auth, User newUser) {
    return true;
  }

}
