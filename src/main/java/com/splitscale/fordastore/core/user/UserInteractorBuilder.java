package com.splitscale.fordastore.core.user;

import com.splitscale.fordastore.core.auth.TokenizedBasicAuth;
import com.splitscale.fordastore.core.http.Message;
import com.splitscale.fordastore.core.http.MessageBuilder;

public class UserInteractorBuilder implements UserInteractor {
  UserDAO dao;

  public UserInteractorBuilder(UserDAO dao) {
    this.dao = dao;
  }

  @Override
  public DisplayableUser authUser(TokenizedBasicAuth request) {
    User user = dao.readUserByUID("some-id");

    return new DisplayableUserBuilder(user);
  }

  @Override
  public Message deleteUser(TokenizedBasicAuth request, String uid) {
    if (!request.getToken().equals("token")) {
      return new MessageBuilder("failed to delete User");
    }

    return new MessageBuilder("User deleted");
  }

  @Override
  public Message updateUser(TokenizedBasicAuth request, String uid) {
    if (!request.getToken().equals("token")) {
      return new MessageBuilder("failed to update User");
    }

    return new MessageBuilder("User updated");
  }

}
