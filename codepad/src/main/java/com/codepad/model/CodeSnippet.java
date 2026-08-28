package com.codepad.model;

public class CodeSnippet {
    private String sourceCode;
    private String className;

    public CodeSnippet(String sourceCode, String className) {
        this.sourceCode = sourceCode;
        this.className = className;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public String getClassName() {
        return className;
    }
}
