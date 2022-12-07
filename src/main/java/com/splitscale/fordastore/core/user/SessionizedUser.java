package com.splitscale.fordastore.core.user;

import com.splitscale.fordastore.core.security.Sessionable;

/**
 * @param sessionID
 *                  - used in identifying current user session
 *                  - core generated value
 */
public interface SessionizedUser extends Sessionable, User {

}
