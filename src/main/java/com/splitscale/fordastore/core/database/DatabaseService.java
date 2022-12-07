package com.splitscale.fordastore.core.database;

public interface DatabaseService {
  /**
   * establishes connection to the table
   * 
   * @return UserTableActions
   *         - interactions available for user table
   */
  UserTableActions getUserTable();
}
