package com.splitscale.fordastore.core.user;

public class UserBuilder implements User {
  private String username;
  private String password;
  private String uid;
  private long serverID;

  public void setServerID(long serverID) {
    this.serverID = serverID;
  }

  public UserBuilder() {
    // default
  }

  /**
   * 
   * @param username
   * @param uid
   *                 - generated before storing in the database
   */
  public UserBuilder(String uid, String username, String password) {
    this.username = username;
    this.password = password;
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

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public long getServerID() {
    return serverID;
  }

}
