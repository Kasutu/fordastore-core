package com.splitscale.fordastore.core.user;

public interface SecurityService {

  String encrypt(String input);

  boolean compareEncryption(String input, String encryptedInput);

}
