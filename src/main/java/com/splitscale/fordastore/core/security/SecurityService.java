package com.splitscale.fordastore.core.security;

public interface SecurityService {

  String encrypt(String input);

  boolean compareEncryption(String input, String encryptedInput);

}
