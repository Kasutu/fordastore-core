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

### UrlRepository

```java
public interface UrlRepository {

  public List<Url> getALLByOwnerID(long ownerID) throws IOException;

  public Url getByContentID(long contentID) throws IOException;

  public Url add(Url container) throws IOException;

  public Url update(Url container) throws IOException;

  public boolean delete(long containerID) throws IOException;
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

### Url

```java

public class Url {

  public String getInnerData();

  public void setInnerData(String innerData);

  public Credential getInnerCredential();

  public void setInnerCredential(Credential innerCredential);

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

### `IOException`

Having some problem reading/writing? Throw this exception.
