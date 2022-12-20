package com.splitscale.fordastore.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.splitscale.fordastore.core.auth.PublicKey;
import com.splitscale.fordastore.core.repositories.AuthRepository;

@ExtendWith(value = { MockitoExtension.class })
public class AuthTest {

  @Mock
  AuthRepository fixture;

  @Mock
  PublicKey publicKey;

  @Test
  @DisplayName("should return public Key from com.splitscale.fordastore.core.auth.PublicKey")
  void testGetByID() throws IOException {
    final String uid = "uid";

    when(fixture.getByID(uid)).thenReturn(publicKey);

    assertEquals(publicKey, fixture.getByID(uid));
  }

  @Test
  @DisplayName("should insert the user successfully")
  void testInsert() throws IOException {
    when(fixture.insert(publicKey)).thenReturn(true);

    assertEquals(true, fixture.insert(publicKey));
  }

  @Test
  @DisplayName("should update the user successfully")
  void testUpdate() throws IOException {
    when(fixture.update(publicKey)).thenReturn(true);
    
    assertEquals(true, fixture.update(publicKey));
  }

  @Test
  @DisplayName("should delete the user by id successfully")
  void testDeleteById() throws IOException {
    final String uid = "uid";

    when(fixture.deleteByID(uid)).thenReturn(true);

    assertEquals(true, fixture.deleteByID(uid));
  }
}
