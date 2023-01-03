package com.splitscale.fordastore.core.repositories;

import java.io.IOException;

import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserRequest;

public interface UserRepository {

  public User findByUID(String uid) throws IOException;

  public User findByUsername(String username) throws IOException;

  public void add(UserRequest userRequest) throws IOException;

  public boolean update(Long id, UserRequest userRequest) throws IOException;
}
