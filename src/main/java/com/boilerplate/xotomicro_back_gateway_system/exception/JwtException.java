package com.boilerplate.xotomicro_back_gateway_system.exception;

public class JwtException extends RuntimeException {
    static final long serialVersionUID = 1L;

    public JwtException(String message) {
        super(message);
    }
}
