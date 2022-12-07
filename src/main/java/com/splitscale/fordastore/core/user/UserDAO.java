package com.splitscale.fordastore.core.user;

import com.splitscale.fordastore.core.auth.TokenizedBasicAuth;

public interface UserDAO {
  // finds the user using username
  User createUser(String username, String password);

  /**
   * 
   * @param username - username
   * @return User
   * 
   *         - returns a User object along with password
   */
  User getUserByUsername(String username);

  /**
   * 
   * @param uid - user uid
   * @return User
   * 
   *         - returns a User object along with password
   */

  User getUserByUID(String uid);

  /**
   * 
   * @param id - user database ID
   * @return User
   * 
   *         - returns a User object along with password
   */
  User getUserById(long id);

  /**
   * 
   * @param userAuth
   *                 - to authenticate the user before modifying
   * @param newUser
   *                 - new user data
   * 
   * @return true if success
   */
  boolean updateUser(TokenizedBasicAuth userAuth, User newUser);

  /**
   * 
   * @param userAuth
   *                 - to authenticate the user before modifying
   * @param newUser
   *                 - new user data
   * 
   * @return true if success
   */
  boolean deleteUser(TokenizedBasicAuth userAuth, User newUser);
}
