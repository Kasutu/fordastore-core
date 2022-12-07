package com.splitscale.fordastore.core.database;

import java.util.List;

import com.splitscale.fordastore.core.user.User;

public interface UserTableActions {
  boolean createUser(User user);

  User readByUID(String uid);

  List<User> readAll();

  boolean updateUser(User user);

  boolean deleteUser(String uid);
}
