# Interface definitions

## DAOS

### UserRepository

```java
public interface UserRepository {
  public User findByUsername(String username);

  public User findByUID(String uid);

  public boolean add(User user);
}
```

### ContentRepository

```java
public interface ContentRepository {

  public List<Content> getALLByOwnerID(long ownerID);

  public Content getByContentID(long contentID);

  public Content add(Content container) throws ObjectAlreadyExistException, ActionFailedException;

  public Content update(Content container) throws ActionFailedException;

  public boolean delete(long containerID) throws ActionFailedException;
}
```

### ContainerRepository

```java
public interface ContainerRepository {
  public List<Container> getByOwnerID(long ownerID);

  public Container getByContainerID(long containerID);

  public Container getByName(String name);

  public Container add(Container container) throws ObjectAlreadyExistException, ActionFailedException;

  public Container update(Container container) throws ActionFailedException, ObjectNotFoundException;

  public boolean delete(long containerID) throws ActionFailedException, ObjectNotFoundException;
}
```

## Entities

### User

```java
public interface User {
  String getUsername();

  String getPassword();

  String getUID();

  long getServerID();

  void setUsername(String username);

  void setPassword(String password);

  void setUID(String uid);

  void setServerID(long serverID);
}
```

### Content

```java

public interface Content {

  public String getData();

  public Credential getCredential();

  public void setData(String data);

  public void setCredential(Credential credential);

}

```

### Container

```java
public interface Container {
  String getName();

  long getContainerID();

  long getOwnerID();

  void setName(String name);

  void setContainerID(long containerID);

  void setOwnerID(long userID);

}

```

# Exception definitions

### ActionFailedException

```java
public class ActionFailedException extends Exception

```

### ObjectNotFoundException

```java
public class ObjectAlreadyExistException extends Exception
```

### ObjectNotFoundException

```java
public class ObjectNotFoundException extends Exception
```
