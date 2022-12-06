package com.splitscale.fordastore.core.user;

public interface User {
  long getID();

  String getUsername();

  String getPassword();

  void setID();

  void setUsername();

  void setPassword();
}
