package com.partition.exception;

public class FunctionalException extends Exception {
    private static final long serialVersionUID = 4931945056191028740L;
    private String code;

    public FunctionalException() {
    }

    public FunctionalException(String code) {
        this.code = code;
    }

    public FunctionalException(String code, String message) {
        super(message);
        this.code = code;
    }

    public FunctionalException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String code) {
        this.code = code;
    }
}
