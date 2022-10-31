package com.vtandon.projects.designpatterns.behavioral.command.Command;

import com.vtandon.projects.designpatterns.behavioral.command.receiver.PhilipsFan;

public class PhilipsFanOnCommand implements ICommand {

    PhilipsFan philipsFan;

    public PhilipsFanOnCommand(PhilipsFan philipsFan) {
        this.philipsFan = philipsFan;
    }

    @Override
    public void execute() {
        philipsFan.switchOn();
    }

    @Override
    public void unExecute() {
        philipsFan.switchOff();
    }
}
