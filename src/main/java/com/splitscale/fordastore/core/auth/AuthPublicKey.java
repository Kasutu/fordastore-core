package com.splitscale.fordastore.core.auth;

public class AuthPublicKey {
  private String uid;
  private String publicKey;

  public AuthPublicKey() {
    // default constructor
  }

  public AuthPublicKey(String uid, String publicKey) {
    this.uid = uid;
    this.publicKey = publicKey;
  }

  public String getUid() {
    return uid;
  }

  public String getPublicKey() {
    return publicKey;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

}
