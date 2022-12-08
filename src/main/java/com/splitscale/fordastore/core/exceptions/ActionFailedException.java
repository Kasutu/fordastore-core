package com.splitscale.fordastore.core.exceptions;

public class ActionFailedException extends Exception {

  public ActionFailedException() {
  }

  public ActionFailedException(String arg0) {
    super(arg0);
  }

  public ActionFailedException(Throwable arg0) {
    super(arg0);
  }

  public ActionFailedException(String arg0, Throwable arg1) {
    super(arg0, arg1);
  }

  public ActionFailedException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
    super(arg0, arg1, arg2, arg3);
  }

}
