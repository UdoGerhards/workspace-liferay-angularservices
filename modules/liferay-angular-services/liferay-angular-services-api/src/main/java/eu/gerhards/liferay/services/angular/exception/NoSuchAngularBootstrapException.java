package eu.gerhards.liferay.services.angular.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * Created by udogerhards on 07.01.17.
 */
public class NoSuchAngularBootstrapException extends NoSuchModelException {

    public NoSuchAngularBootstrapException() {
    }

    public NoSuchAngularBootstrapException(String msg) {
        super(msg);
    }

    public NoSuchAngularBootstrapException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NoSuchAngularBootstrapException(Throwable cause) {
        super(cause);
    }
}
