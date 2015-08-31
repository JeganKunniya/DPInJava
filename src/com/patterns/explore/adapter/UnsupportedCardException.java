package com.patterns.explore.adapter;

/**
 * Created by 310079932 on 30-Aug-15.
 */
public class UnsupportedCardException extends Exception {
    public UnsupportedCardException() {
        super();
    }

    public UnsupportedCardException(String message) {
        super(message);
    }

    public UnsupportedCardException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedCardException(Throwable cause) {
        super(cause);
    }

    protected UnsupportedCardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
