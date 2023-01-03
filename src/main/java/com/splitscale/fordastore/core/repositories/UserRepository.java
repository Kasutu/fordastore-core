package com.splitscale.fordastore.core.repositories;

import java.io.IOException;

import com.splitscale.fordastore.core.user.User;

public interface UserRepository {

  public User findByUID(String uid) throws IOException;

  public User findByUsername(String username) throws IOException;

  public User add(String username, String password) throws IOException;

  public User update(String uid, String username, String password) throws IOException;
}
