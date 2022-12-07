package com.splitscale.fordastore.core.http;

import java.util.HashMap;
import java.util.Map;

public class MessageBuilder implements Message {
  private String message;
  private boolean status;

  public MessageBuilder(String message, boolean status) {
    this.message = message;
    this.status = status;
  }

  public MessageBuilder(String message) {
    this(message, false);
  }

  @Override
  public Map<String, String> getMessage() {
    Map<String, String> msg = new HashMap<String, String>();

    msg.put("message", message);

    return msg;
  }

  @Override
  public boolean getStatus() {
    return status;
  }
}
