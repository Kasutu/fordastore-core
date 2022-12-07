package com.splitscale.fordastore.core.security;

public interface Encryptable {

  String encrypt(String input);

  boolean compareEncryption(String input, String encryptedInput);

}
