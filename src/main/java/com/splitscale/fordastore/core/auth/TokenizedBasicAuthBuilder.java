package com.splitscale.fordastore.core.auth;

public class TokenizedBasicAuthBuilder implements TokenizedBasicAuth {
  private String token;
  private String username;
  private String password;

  public TokenizedBasicAuthBuilder(String token, String username, String password) {
    this.token = token;
    this.username = username;
    this.password = password;
  }

  @Override
  public String getToken() {
    return token;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public String getPassword() {
    return password;
  }

}
