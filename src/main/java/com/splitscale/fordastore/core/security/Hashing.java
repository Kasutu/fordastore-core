package com.splitscale.fordastore.core.security;

public interface Hashing {

  String getHash(String input);

  boolean compareHash(String input, String encryptedInput);

}
