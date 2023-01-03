package com.splitscale.fordastore.core.url;

public class Url {
  private long urlID;
  private long containerID;
  private String innerUrl;

  public Url(long urlID, long containerID, String innerUrl) {
    this.urlID = urlID;
    this.containerID = containerID;
    this.innerUrl = innerUrl;
  }

  public Url() {
    // default constructor
  }

  public long getUrlID() {
    return urlID;
  }

  public void setUrlID(long urlID) {
    this.urlID = urlID;
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
