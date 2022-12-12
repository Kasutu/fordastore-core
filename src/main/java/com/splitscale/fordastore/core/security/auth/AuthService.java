package com.splitscale.fordastore.core.security.auth;

import java.security.PublicKey;

import com.splitscale.fordastore.core.security.Authorization;
import com.splitscale.fordastore.core.user.register.UserClaims;

public interface AuthService {

  /**
   * @return Authorization
   *         - has token and public key
   */
  Authorization getAuthorization(UserClaims userClaims);

  /**
   * 
   * @param token     token string
   * @param publicKey
   * @return UID if token is valid
   */
  UserClaims authorize(String token, String publicKey);

  /**
   * 
   * @param publicKey
   * @return base64 encoded public key
   */
  public String publicKeyToBase64(PublicKey publicKey);

  /**
   * 
   * @param base64String
   * @return public key object
   * @throws Exception
   */
  public PublicKey base64ToPublicKey(String base64String) throws Exception;
}