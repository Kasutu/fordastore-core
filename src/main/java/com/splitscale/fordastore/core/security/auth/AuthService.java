package com.splitscale.fordastore.core.security.auth;

import java.security.PublicKey;

public interface AuthService {

  /**
   * @return Authorization
   *         - has token and public key
   */
  Authorization getAuthorization(String uid);

  /**
   * 
   * @param jwt       token string
   * @param publicKey
   * @return UID if token is valid
   */
  String authorize(String jwt, PublicKey publicKey);
}