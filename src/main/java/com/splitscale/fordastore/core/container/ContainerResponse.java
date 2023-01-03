package com.splitscale.fordastore.core.container;

public class ContainerResponse {
  private long containerID;
  private String name;

  public ContainerResponse(long containerID, String name) {
    this.containerID = containerID;
    this.name = name;
  }

  public ContainerResponse() {
    // default
  }

  public long getContainerID() {
    return containerID;
  }

  public void setContainerID(long containerID) {
    this.containerID = containerID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
