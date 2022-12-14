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

import com.splitscale.fordastore.core.content.Content;
import com.splitscale.fordastore.core.content.Credential;

@ExtendWith(value = { MockitoExtension.class })
public class ContentTest {

  @Mock
  Content content;

  @Mock
  Credential credential;

  @Test
  @DisplayName("Test getters of content property")
  public void gettersTest() {

    String name = "some name";

    when(content.getData()).thenReturn(name);
    when(content.getCredential()).thenReturn(credential);

    assertEquals(name, content.getData());
    assertEquals(credential, content.getCredential());
  }

  @Test
  @DisplayName("Test setters of content property")
  public void settersTest() {

    String name = "some name";

    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);
    ArgumentCaptor<Credential> mockCaptor = ArgumentCaptor.forClass(Credential.class);

    when(content.getData()).thenReturn(name);
    when(content.getCredential()).thenReturn(credential);

    assertEquals(name, content.getData());
    assertEquals(credential, content.getCredential());

    content.setData(name);
    content.setCredential(credential);

    verify(content).setData(stringCaptor.capture());
    verify(content).setCredential(mockCaptor.capture());
  }

}
