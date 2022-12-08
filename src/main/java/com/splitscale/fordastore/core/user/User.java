package com.splitscale.fordastore.core.user;

public interface User {
  String getUsername();

  String getPassword();

  String getUID();

  long getServerID();

  void setUsername(String username);

  void setPassword(String password);

  void setUID(String uid);

  void setServerID(long serverID);
}
