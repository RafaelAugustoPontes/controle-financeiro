package com.example.controle.domain.flow;

public class RuleResult {

    private final boolean success;
    private final String message;

    private RuleResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public static RuleResult success() {
        return new RuleResult(true, null);
    }

    public static RuleResult failure(String message) {
        return new RuleResult(false, message);
    }

    @Override
    public String toString() {
        return "RuleResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }

}
