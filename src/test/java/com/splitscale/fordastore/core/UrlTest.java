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

import com.splitscale.fordastore.core.url.Url;

@ExtendWith(value = { MockitoExtension.class })
public class UrlTest {

  @Mock
  Url fixture;

  @Test
  @DisplayName("Test getters of url property")
  public void gettersTest() {

    String data = "some url";
    long id = 123451234;

    when(fixture.getInnerUrl()).thenReturn(data);
    when(fixture.getUrlID()).thenReturn(id);

    assertEquals(data, fixture.getInnerUrl());
    assertEquals(id, fixture.getUrlID());
  }

  @Test
  @DisplayName("Test setters of url property")
  public void settersTest() {

    String data = "some url";
    long id = 123451234;

    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);
    ArgumentCaptor<Long> longCaptor = ArgumentCaptor.forClass(Long.class);

    fixture.setInnerUrl(data);
    fixture.setUrlID(id);

    verify(fixture).setInnerUrl(stringCaptor.capture());
    verify(fixture).setUrlID(longCaptor.capture());
  }
}
