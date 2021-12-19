package com.vtandon.projects.designpatterns.behavioral.command.invoker;

import com.vtandon.projects.designpatterns.behavioral.command.concreteCommand.ActionListenerCommand;

public class Invoker1 {
    private ActionListenerCommand openCommand;
    private ActionListenerCommand closeCommand;

    public Invoker1(ActionListenerCommand openCommand, ActionListenerCommand closeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
    }

    public void triggerOpen() {
        openCommand.execute();
    }

    public void triggerCloe() {
        closeCommand.execute();
    }
}
