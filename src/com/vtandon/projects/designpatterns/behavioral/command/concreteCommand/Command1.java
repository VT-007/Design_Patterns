package com.vtandon.projects.designpatterns.behavioral.command.concreteCommand;

import com.vtandon.projects.designpatterns.behavioral.command.receiver.Receiver1;

public class Command1 implements ActionListenerCommand{

    Receiver1 receiver1;

    public Command1(Receiver1 receiver1) {
        this.receiver1 = receiver1;
    }

    @Override
    public void execute() {
        receiver1.open();
    }
}
