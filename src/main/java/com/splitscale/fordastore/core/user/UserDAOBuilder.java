package com.splitscale.fordastore.core.user;

import com.splitscale.fordastore.core.auth.TokenizedBasicAuth;
import com.splitscale.fordastore.core.database.DatabaseService;
import com.splitscale.fordastore.core.security.SecurityService;

public class UserDAOBuilder implements UserDAO {
  SecurityService securityService;
  DatabaseService databaseService;

  public UserDAOBuilder(SecurityService securityService, DatabaseService databaseService) {
    this.securityService = securityService;
    this.databaseService = databaseService;
  }

  @Override
  public User readUserByUID(String uid) {
    return new UserBuilder("someUsername", "somePassword");
  }

  @Override
  public User createUser(String username, String password) {
    return new UserBuilder(username, password);
  }

  @Override
  public User readUserByUsername(String username) {
    return new UserBuilder(username, "some pwd");
  }

  @Override
  public User readUserById(long id) {
    return new UserBuilder("username", "password");
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
