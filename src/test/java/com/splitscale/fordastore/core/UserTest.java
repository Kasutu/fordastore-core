package com.splitscale.fordastore.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.splitscale.fordastore.core.user.User;

@ExtendWith(value = { MockitoExtension.class })
public class UserTest {
  @Mock
  private User user;

  @Test
  @DisplayName("Test getters of User")
  public void gettersTest() {
    String username = "someUsername";
    String password = "somePwd";
    String uid = "someUID";

    when(user.getUsername()).thenReturn(username);
    when(user.getPassword()).thenReturn(password);
    when(user.getUid()).thenReturn(uid);

    assertEquals(username, user.getUsername());
    assertEquals(password, user.getPassword());
    assertEquals(uid, user.getUid());
  }

  @Test
  @DisplayName("Test setters of User")
  public void settersTest() {
    String username = "someUsername";
    String password = "somePwd";
    String uid = "someUID";

    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);

    user.setUsername(username);
    user.setPassword(password);
    user.setUid(uid);

    verify(user).setUsername(stringCaptor.capture());
    verify(user).setPassword(stringCaptor.capture());
    verify(user).setUid(stringCaptor.capture());
  }
}
