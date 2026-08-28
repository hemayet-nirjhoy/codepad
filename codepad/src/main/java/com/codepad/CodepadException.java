package com.codepad;

public class CodepadException extends Exception{
    public CodepadException(String message) {
        super(message);
    }

    public CodepadException(String message, Throwable cause) {
        super(message, cause);
    }
}
