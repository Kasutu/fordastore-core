package com.splitscale.fordastore.core.content;

public interface Credential {
  String getUsername();

  String getPassword();

  void setUsername(String username);

  void setPassword(String password);
}
