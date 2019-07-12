package com.zh.o2o.exceptions;

public class ProductOperationException extends RuntimeException {

    private static final long serialVersionUID = 8638615339940704461L;

    public ProductOperationException(String msg) {
        super(msg);
    }
}
