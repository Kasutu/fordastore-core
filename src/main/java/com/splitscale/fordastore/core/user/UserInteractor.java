package com.splitscale.fordastore.core.user;

import com.splitscale.fordastore.core.auth.TokenizedBasicAuth;
import com.splitscale.fordastore.core.http.Message;

public interface UserInteractor {
  DisplayableUser authUser(TokenizedBasicAuth request);

  Message deleteUser(TokenizedBasicAuth request, String uid);

  Message updateUser(TokenizedBasicAuth request, String uid);
}
