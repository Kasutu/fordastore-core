package com.splitscale.fordastore.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.splitscale.fordastore.core.auth.AuthPublicKey;
import com.splitscale.fordastore.core.repositories.AuthRepository;

@ExtendWith(value = { MockitoExtension.class })
public class AuthRepositoryTest {

  @Mock
  AuthRepository fixture;

  @Mock
  AuthPublicKey publicKey;

  @Test
  @DisplayName("should return AuthPublicKey from com.splitscale.fordastore.core.auth.AuthPublicKey")
  void testGetByID() throws IOException {
    final String uid = "uid";

    when(fixture.getByUid(uid)).thenReturn(publicKey);

    assertEquals(publicKey, fixture.getByUid(uid));
  }

  @Test
  @DisplayName("should insert the AuthPublicKey successfully")
  void testInsert() throws IOException {
    ArgumentCaptor<AuthPublicKey> publicKeyCaptor = ArgumentCaptor.forClass(AuthPublicKey.class);

    fixture.insert(publicKey);

    verify(fixture).insert(publicKeyCaptor.capture());
  }

  @Test
  @DisplayName("should update the AuthPublicKey successfully")
  void testUpdate() throws IOException {
    ArgumentCaptor<AuthPublicKey> publicKeyCaptor = ArgumentCaptor.forClass(AuthPublicKey.class);

    fixture.update(publicKey);

    verify(fixture).update(publicKeyCaptor.capture());
  }

  @Test
  @DisplayName("should delete the user by id successfully")
  void testDeleteById() throws IOException {
    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);

    fixture.deleteByUid("uid");

    verify(fixture).deleteByUid(stringCaptor.capture());
  }
}
