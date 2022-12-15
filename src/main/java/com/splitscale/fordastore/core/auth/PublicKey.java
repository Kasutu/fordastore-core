package com.splitscale.fordastore.core.auth;

public class PublicKey {
  private String uid;
  private String keyValue;

  public PublicKey(String uid, String keyValue) {
    this.uid = uid;
    this.keyValue = keyValue;
  }

  public String getUid() {
    return uid;
  }

  public String getPublicKey() {
    return keyValue;
  }

}
