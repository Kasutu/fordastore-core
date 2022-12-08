package com.splitscale.fordastore.core.daos;

import com.splitscale.fordastore.core.user.User;

public interface UserRepository {
  public User findByUsername(String username);

  public User findByUID(String uid);

  public boolean add(User user);
}
