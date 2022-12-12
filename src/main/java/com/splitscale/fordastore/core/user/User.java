package com.splitscale.fordastore.core.user;

public interface User {
  String getUsername();

  String getPassword();

  String getUid();

  void setUsername(String username);

  void setPassword(String password);

  void setUid(String uid);

}
