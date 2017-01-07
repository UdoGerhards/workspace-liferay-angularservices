package eu.gerhards.liferay.services.angular.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * Created by udogerhards on 06.01.17.
 */
public class NoSuchAngularPortalException extends NoSuchModelException {
    public NoSuchAngularPortalException() {
    }

    public NoSuchAngularPortalException(String msg) {
        super(msg);
    }

    public NoSuchAngularPortalException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NoSuchAngularPortalException(Throwable cause) {
        super(cause);
    }

}
