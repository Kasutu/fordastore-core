package com.splitscale.fordastore.core.user;

public class UserBuilder implements User {
  private String username;
  private String password;
  private String uid;

  public UserBuilder() {
    // default
  }

  public UserBuilder(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @Override
  public String getUid() {
    return uid;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public void setUid(String uid) {
    this.uid = uid;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {

    return "username: " + username + " password: " + password + " uid: " + uid;

  }

}
