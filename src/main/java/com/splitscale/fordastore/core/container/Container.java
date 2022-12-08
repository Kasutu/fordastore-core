package com.splitscale.fordastore.core.container;

public interface Container {
  String getName();

  long getContainerID();

  long getOwnerID();

  void setName(String name);

  void setContainerID(long containerID);

  void setOwnerID(long userID);

}
