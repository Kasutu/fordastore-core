package com.splitscale.fordastore.core.container;

public class Container {
  private long containerID;
  private String uid;
  private String name;

  public Container(long containerID, String uid, String name) {
    this.containerID = containerID;
    this.uid = uid;
    this.name = name;
  }

  public long getContainerID() {
    return containerID;
  }

  public void setContainerID(long containerID) {
    this.containerID = containerID;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
