package com.github.fantasticlab.mq.core.broker;

public class BrokerException extends RuntimeException {
    public BrokerException(String message) {
        super(message);
    }

    public BrokerException(Throwable cause) {
        super(cause);
    }
}
