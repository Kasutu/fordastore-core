# Interface definitions

## User Subsystem

### User

```
public interface User {
  String getUsername();
  String getUID();
  void setUsername(String username);
  void setUID(String uid);
}
```

### DisplayableUser

```
public interface DisplayableUser {
  String getUsername();
  String getUID();

}
```

### InteractableUser

```
public interface InteractableUser {
  DisplayableUser authUser(TokenizedBasicAuth request);
  Message deleteUser(TokenizedBasicAuth request, String uid);
  Message updateUser(TokenizedBasicAuth request, String uid);
}
```

### SerializedUser

```
public interface SerializedUser extends Serializable, User {}
```

### SessionizedUser

```
public interface SessionizedUser extends Sessionable, User {}
```

### UserDAO

```
public interface UserDAO {
  User createUser(String username, String password);
  User readUserByUsername(String username);
  User readUserByUID(String uid);
  User readUserById(long id);
  boolean updateUser(TokenizedBasicAuth userAuth, User newUser);
  boolean deleteUser(TokenizedBasicAuth userAuth, User newUser);
}

```
