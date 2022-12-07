package com.splitscale.fordastore.core.user;

public class DisplayableUserBuilder implements DisplayableUser {
  private String uid;
  private String username;

  public DisplayableUserBuilder(String uid, String username) {
    this.uid = uid;
    this.username = username;
  }

  public DisplayableUserBuilder(User user) {
    this.uid = user.getUID();
    this.username = user.getUsername();
  }

  @Override
  public String getUID() {
    return uid;
  }

  @Override
  public String getUsername() {
    return username;
  }

}
