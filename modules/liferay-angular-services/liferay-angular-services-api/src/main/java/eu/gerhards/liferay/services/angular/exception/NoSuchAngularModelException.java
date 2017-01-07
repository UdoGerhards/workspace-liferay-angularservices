package eu.gerhards.liferay.services.angular.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * Created by udogerhards on 06.01.17.
 */
public class NoSuchAngularModelException extends NoSuchModelException {

    public NoSuchAngularModelException() {
    }

    public NoSuchAngularModelException(String msg) {
        super(msg);
    }

    public NoSuchAngularModelException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NoSuchAngularModelException(Throwable cause) {
        super(cause);
    }

}
