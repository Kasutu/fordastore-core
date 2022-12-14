package com.splitscale.fordastore.core.user;

public class UserRequest {
  private String username;
  private String password;

  public UserRequest() {
    // default constructor
  }

  public UserRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
