package com.splitscale.fordastore.core.url;

public class UrlRequest {

  private long containerID;
  private String innerUrl;

  public UrlRequest(long containerID, String innerUrl) {
    this.containerID = containerID;
    this.innerUrl = innerUrl;
  }

  public long getContainerID() {
    return containerID;
  }

  public void setContainerID(long containerID) {
    this.containerID = containerID;
  }

  public String getInnerUrl() {
    return innerUrl;
  }

  public void setInnerUrl(String innerUrl) {
    this.innerUrl = innerUrl;
  }

}
