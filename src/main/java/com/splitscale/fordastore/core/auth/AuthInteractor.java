package com.splitscale.fordastore.core.auth;

import com.splitscale.fordastore.core.http.Message;
import com.splitscale.fordastore.core.user.DisplayableUser;

public interface AuthInteractor {
  DisplayableUser login(TokenizedBasicAuth credentials);

  Message register(BasicAuth credentials);

  Message logout();

}
