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

import com.splitscale.fordastore.core.container.Container;

@ExtendWith(value = { MockitoExtension.class })
public class ContainerTest {
  @Mock
  Container container;

  @Test
  @DisplayName("Test getters of Container")
  public void gettersTest() {

    String name = "some name";
    long containerId = 2;
    String ownerId = "ahdiawuhd-awdnaikwbdikab-adnwkiabd";

    when(container.getName()).thenReturn(name);
    when(container.getContainerID()).thenReturn(containerId);
    when(container.getUid()).thenReturn(ownerId);

    assertEquals(name, container.getName());
    assertEquals(containerId, container.getContainerID());
    assertEquals(ownerId, container.getUid());
  }

  @Test
  @DisplayName("Test setters of Container")
  public void settersTest() {
    String name = "some name";
    long containerId = 2;
    String ownerId = "ajowjdoa-awdnaibndk-wadandiawjdanwkd";

    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);
    ArgumentCaptor<Long> longCaptor = ArgumentCaptor.forClass(Long.class);

    container.setName(name);
    container.setContainerID(containerId);
    container.setUid(ownerId);

    verify(container).setName(stringCaptor.capture());
    verify(container).setContainerID(longCaptor.capture());
    verify(container).setUid(stringCaptor.capture());
  }
}
