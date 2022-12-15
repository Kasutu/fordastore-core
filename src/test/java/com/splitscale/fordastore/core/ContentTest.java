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

import com.splitscale.fordastore.core.content.Url;
import com.splitscale.fordastore.core.content.Credential;

@ExtendWith(value = { MockitoExtension.class })
public class ContentTest {

  @Mock
  Url fixture;

  @Mock
  Credential credential;

  @Test
  @DisplayName("Test getters of url property")
  public void gettersTest() {

    String data = "some url";

    when(fixture.getInnerData()).thenReturn(data);
    when(fixture.getInnerCredential()).thenReturn(credential);

    assertEquals(data, fixture.getInnerData());
    assertEquals(credential, fixture.getInnerCredential());
  }

  @Test
  @DisplayName("Test setters of url property")
  public void settersTest() {

    String data = "some url";

    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);
    ArgumentCaptor<Credential> mockCaptor = ArgumentCaptor.forClass(Credential.class);

    when(fixture.getInnerData()).thenReturn(data);
    when(fixture.getInnerCredential()).thenReturn(credential);

    assertEquals(data, fixture.getInnerData());
    assertEquals(credential, fixture.getInnerCredential());

    fixture.setInnerData(data);
    fixture.setInnerCredential(credential);

    verify(fixture).setInnerData(stringCaptor.capture());
    verify(fixture).setInnerCredential(mockCaptor.capture());
  }

}
