package com.wissensalt.tgf.web.thymeleaf.client;

import com.wissensalt.tgf.web.thymeleaf.util.exception.ATGFException;


/**
 * Created on 4/2/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class RestClientException extends ATGFException {
    /**
     *
     *
     */
    private static final long serialVersionUID = 2834388077485251663L;

    public RestClientException(String message) {
        super(message);
    }

    public RestClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
