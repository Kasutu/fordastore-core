package com.splitscale.fordastore.core.user.register;

public class UserClaims {
  private String username;
  private Long id;
  private String uid;

  public UserClaims() {
    // default constructor
  }

  public UserClaims(String username, Long id, String uid) {
    this.id = id;
    this.uid = uid;
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }
}
