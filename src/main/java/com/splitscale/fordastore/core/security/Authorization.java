package com.splitscale.fordastore.core.security;

import java.security.PublicKey;

public interface Authorization {
  PublicKey getPublicKey();

  String getToken();
}
