package com.splitscale.fordastore.core.security;

public interface EncryptionService {

  String encrypt(String input);

  boolean compareEncryption(String input, String encryptedInput);

}
