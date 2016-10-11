package ru.terrakok.cicerone.commands;

/**
 * Created by Konstantin Tckhovrebov (aka @terrakok)
 * on 11.10.16
 */

public class SystemMessage implements Command {
    private String message;

    public SystemMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
