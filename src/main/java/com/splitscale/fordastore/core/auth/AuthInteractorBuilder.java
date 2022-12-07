package com.splitscale.fordastore.core.auth;

import com.splitscale.fordastore.core.http.Message;
import com.splitscale.fordastore.core.http.MessageBuilder;
import com.splitscale.fordastore.core.security.SecurityService;
import com.splitscale.fordastore.core.user.DisplayableUser;
import com.splitscale.fordastore.core.user.DisplayableUserBuilder;
import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserDAO;

public class AuthInteractorBuilder implements AuthInteractor {
  UserDAO dao;
  SecurityService security;

  public AuthInteractorBuilder(UserDAO dao, SecurityService security) {
    this.dao = dao;
    this.security = security;
  }

  @Override
  public DisplayableUser login(TokenizedBasicAuth credentials) {
    User user = dao.getUserByUsername(credentials.getUsername());
    String token = credentials.getToken();

    DisplayableUser displayableUser = new DisplayableUserBuilder(user);
    String tokenFromDb = "token";

    if (!token.isEmpty() && token.equals(tokenFromDb)) {
      return displayableUser;
    }

    if (security.compareEncryption(credentials.getPassword(), user.getPassword())) {
      return displayableUser;
    }

    return null;
  }

  @Override
  public Message logout() {
    return new MessageBuilder("user logged out!", true);
  }

  @Override
  public Message register(BasicAuth credentials) {
    if (dao.getUserByUsername(credentials.getUsername()) != null) {
      return new MessageBuilder("user already registered! please login", false);
    }

    return new MessageBuilder("user registered! please login", true);
  }

}
