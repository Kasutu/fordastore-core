package com.splitscale.fordastore.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.security.PublicKey;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.splitscale.fordastore.core.security.auth.AuthService;
import com.splitscale.fordastore.core.security.auth.Authorization;

@ExtendWith(value = { MockitoExtension.class })
public class AuthTest {
  @Mock
  Authorization auth;

  @Mock
  AuthService service;

  @Mock
  PublicKey publicKey;

  @Test
  @DisplayName("Test getters of Authorization")
  public void AuthorizationGettersTest() {
    String SOME_TOKEN = "SOME_TOKEN";

    when(auth.getPublicKey()).thenReturn(publicKey);
    when(auth.getToken()).thenReturn(SOME_TOKEN);

    assertEquals(SOME_TOKEN, auth.getToken());
    assertEquals(publicKey, auth.getPublicKey());
  }

  @Test
  @DisplayName("Test getters of AuthService")
  public void AuthServiceGettersTest() {
    String SOME_UID = "SOME_UID";

    when(service.getAuthorization(SOME_UID)).thenReturn(auth);
    when(service.authorize("some token", publicKey)).thenReturn(SOME_UID);

    assertEquals(auth, service.getAuthorization(SOME_UID));
    assertEquals(SOME_UID, service.authorize("some token", publicKey));
  }
}
