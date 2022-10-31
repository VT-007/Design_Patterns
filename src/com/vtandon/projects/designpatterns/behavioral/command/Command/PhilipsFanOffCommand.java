package com.vtandon.projects.designpatterns.behavioral.command.Command;

import com.vtandon.projects.designpatterns.behavioral.command.receiver.PhilipsFan;

public class PhilipsFanOffCommand implements ICommand {

    PhilipsFan philipsFan;

    public PhilipsFanOffCommand(PhilipsFan philipsFan) {
        this.philipsFan = philipsFan;
    }

    @Override
    public void execute() {
        philipsFan.switchOff();
    }

    @Override
    public void unExecute() {
        philipsFan.switchOn();
    }
}
