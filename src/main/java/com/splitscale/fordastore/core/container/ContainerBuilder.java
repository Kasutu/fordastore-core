package com.splitscale.fordastore.core.container;

public class ContainerBuilder implements Container {
  private String name;
  private long containerID;
  private long ownerID;

  public void setContainerID(long containerID) {
    this.containerID = containerID;
  }

  public void setOwnerID(long ownerID) {
    this.ownerID = ownerID;
  }

  public ContainerBuilder(String name, long ownerID) {
    this.name = name;
    this.ownerID = ownerID;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public long getContainerID() {
    return containerID;
  }

  @Override
  public long getOwnerID() {
    return ownerID;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}
