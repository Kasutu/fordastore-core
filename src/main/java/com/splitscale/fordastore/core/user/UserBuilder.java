package com.splitscale.fordastore.core.user;

public class UserBuilder implements User {
  private String username;
  private String uid;

  public UserBuilder() {
    // default
  }

  /**
   * 
   * @param username
   * @param uid
   *                 - generated before storing in the database
   */
  public UserBuilder(String username, String uid) {
    this.username = username;
    this.uid = uid;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public String getUID() {
    return uid;
  }

  @Override
  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public void setUID(String uid) {
    this.uid = uid;
  }

}
