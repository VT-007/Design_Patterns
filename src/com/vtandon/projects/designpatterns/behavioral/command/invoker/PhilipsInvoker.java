package com.vtandon.projects.designpatterns.behavioral.command.invoker;

import com.vtandon.projects.designpatterns.behavioral.command.Command.ICommand;

public class PhilipsInvoker {

    ICommand switchOn;
    ICommand switchOff;


    public PhilipsInvoker(ICommand switchOn, ICommand switchOff) {
        this.switchOn = switchOn;
        this.switchOff = switchOff;
    }

    public void executeCommand(ICommand command) {
        command.execute();
    }

    public void unExecuteCommand(ICommand command) {
        command.unExecute();
    }
}
