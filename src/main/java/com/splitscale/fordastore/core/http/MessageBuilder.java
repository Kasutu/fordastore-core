package com.splitscale.fordastore.core.http;

import java.util.HashMap;
import java.util.Map;

public class MessageBuilder implements Message {
  private String message;

  public MessageBuilder(String message) {
    this.message = message;
  }

  @Override
  public Map<String, String> getMessage() {
    Map<String, String> msg = new HashMap<String, String>();

    msg.put("message", message);

    return msg;
  }
}
