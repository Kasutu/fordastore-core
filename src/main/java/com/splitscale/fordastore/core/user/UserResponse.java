package com.splitscale.fordastore.core.user;

public class UserResponse {
  private String uid;
  private String username;

  public UserResponse(String uid, String username) {
    this.uid = uid;
    this.username = username;
  }

  public String getUID() {
    return uid;
  }

  public String getUsername() {
    return username;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
