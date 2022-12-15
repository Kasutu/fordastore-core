package com.splitscale.fordastore.core.url;

public class Url {
  private String innerData;
  private Credential innerCredential;

  public Url(String innerData, Credential innerCredential) {
    this.innerData = innerData;
    this.innerCredential = innerCredential;
  }

  public String getInnerData() {
    return innerData;
  }

  public void setInnerData(String innerData) {
    this.innerData = innerData;
  }

  public Credential getInnerCredential() {
    return innerCredential;
  }

  public void setInnerCredential(Credential innerCredential) {
    this.innerCredential = innerCredential;
  }

}
