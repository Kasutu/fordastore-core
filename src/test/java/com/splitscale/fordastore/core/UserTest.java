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
    long serverID = 130;

    when(user.getUsername()).thenReturn(username);
    when(user.getPassword()).thenReturn(password);
    when(user.getUID()).thenReturn(uid);
    when(user.getServerID()).thenReturn(serverID);

    assertEquals(username, user.getUsername());
    assertEquals(password, user.getPassword());
    assertEquals(uid, user.getUID());
    assertEquals(serverID, user.getServerID());
  }

  @Test
  @DisplayName("Test setters of User")
  public void settersTest() {
    String username = "someUsername";
    String password = "somePwd";
    String uid = "someUID";
    long serverID = 130;

    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);
    ArgumentCaptor<Long> longCaptor = ArgumentCaptor.forClass(long.class);

    user.setUsername(username);
    user.setPassword(password);
    user.setUID(uid);
    user.setServerID(serverID);

    verify(user).setUsername(stringCaptor.capture());
    verify(user).setPassword(stringCaptor.capture());
    verify(user).setUID(stringCaptor.capture());
    verify(user).setServerID(longCaptor.capture());
  }
}
