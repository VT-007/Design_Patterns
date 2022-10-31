package com.vtandon.projects.designpatterns.behavioral.command.Command;

import com.vtandon.projects.designpatterns.behavioral.command.receiver.PhilipsLight;

public class PhilipsLightOnCommand implements ICommand {

    PhilipsLight philipsLight;

    public PhilipsLightOnCommand(PhilipsLight philipsLight) {
        this.philipsLight = philipsLight;
    }


    @Override
    public void execute() {
        philipsLight.switchOn();
    }

    @Override
    public void unExecute() {
        philipsLight.switchOff();
    }
}
