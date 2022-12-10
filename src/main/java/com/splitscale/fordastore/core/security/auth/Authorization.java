package com.splitscale.fordastore.core.security.auth;

import java.security.PublicKey;

public interface Authorization {
  PublicKey getPublicKey();

  String getToken();
}
