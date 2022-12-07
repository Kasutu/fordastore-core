package com.splitscale.fordastore.core.auth;

import com.splitscale.fordastore.core.security.Tokenizable;

/**
 * @param token
 *              - used for token based authentication
 */
public interface TokenizedBasicAuth extends BasicAuth, Tokenizable {

}
