package com.splitscale.fordastore.core.auth;

public class AuthPublicKey {
  private String uid;
  private String keyValue;

  public AuthPublicKey(String uid, String keyValue) {
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
