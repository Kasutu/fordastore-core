package com.splitscale.fordastore.core.user;

public class UserMapper {
  private UserMapper() {
    // default constructor
  }

  public static UserResponse toUserResponse(User user) {
    return new UserResponse(user.getUid(), user.getUsername());
  }

  public static User toUser(UserRequest request) {
    return new UserBuilder(request.getUsername(), request.getPassword());
  }
}
