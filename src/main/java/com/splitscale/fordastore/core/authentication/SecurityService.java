package com.splitscale.fordastore.core.authentication;

public interface SecurityService {

  String encrypt(String input);

  boolean compareEncryption(String input, String encryptedInput);

}
