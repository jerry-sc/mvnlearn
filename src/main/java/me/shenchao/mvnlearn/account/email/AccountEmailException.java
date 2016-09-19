package me.shenchao.mvnlearn.account.email;

public class AccountEmailException extends Exception {

    public AccountEmailException(String message) {
        super(message);
    }

    public AccountEmailException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
