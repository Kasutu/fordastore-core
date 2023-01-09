package com.splitscale.fordastore.core.url;

public class UrlResponse {
  private Long urlID;
  private String innerUrl;

  public UrlResponse() {
    // default constructor
  }

  public UrlResponse(Long urlID, String innerUrl) {
    this.urlID = urlID;
    this.innerUrl = innerUrl;
  }

  public Long getUrlID() {
    return urlID;
  }

  public void setUrlID(Long urlID) {
    this.urlID = urlID;
  }

  public String getInnerUrl() {
    return innerUrl;
  }

  public void setInnerUrl(String innerUrl) {
    this.innerUrl = innerUrl;
  }
}
