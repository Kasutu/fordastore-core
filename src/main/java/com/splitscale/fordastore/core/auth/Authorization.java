package com.splitscale.fordastore.core.auth;

import java.security.PublicKey;

public class Authorization {
  private PublicKey publicKey;
  private String jwt;

  public Authorization(PublicKey publicKey, String jwt) {
    this.publicKey = publicKey;
    this.jwt = jwt;
  }

  public PublicKey getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
  }

  public String getJwt() {
    return jwt;
  }

  public void setJwt(String jwt) {
    this.jwt = jwt;
  }

}
