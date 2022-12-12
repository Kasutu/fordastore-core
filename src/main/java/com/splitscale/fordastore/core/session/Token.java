package com.splitscale.fordastore.core.session;

public interface Token {
  public String getUID();

  public Long getID();

  public String getPublicKey();

  public void setUID();

  public void setID();

  public void setPublicKey();
}
