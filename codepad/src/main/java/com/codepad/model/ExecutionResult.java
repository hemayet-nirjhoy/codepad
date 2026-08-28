package com.codepad.model;

public class ExecutionResult {
    private String output;
    private String error;
    private boolean success;
    private long executionTime;

    public ExecutionResult(String output, String error, boolean success, long executionTime) {
        this.output = output;
        this.error = error;
        this.success = success;
        this.executionTime = executionTime;
    }

    public String getOutput() {
        return output;
    }

    public String getError() {
        return error;
    }

    public boolean isSuccess() {
        return success;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    @Override
    public String toString() {
        return "ExecutionResult{" +
                "output='" + output + '\'' +
                ", error='" + error + '\'' +
                ", success=" + success +
                ", executionTime=" + executionTime + "ms" +
                '}';
    }
}
