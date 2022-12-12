package com.splitscale.fordastore.core.security;

public interface EncryptionService {

  String encrypt(String input);

  boolean verify(String password, String hash);

}
