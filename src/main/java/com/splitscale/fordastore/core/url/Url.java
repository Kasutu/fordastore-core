package com.splitscale.fordastore.core.url;

public class Url {
  private long urlID;
  private String innerUrl;

  public Url() {
    // default constructor
  }

  public Url(long urlID, String innerUrl) {
    this.urlID = urlID;
    this.innerUrl = innerUrl;
  }

  public String getInnerUrl() {
    return innerUrl;
  }

  public void setInnerUrl(String innerUrl) {
    this.innerUrl = innerUrl;
  }

  public long getUrlID() {
    return urlID;
  }

  public void setUrlID(long urlID) {
    this.urlID = urlID;
  }
}
