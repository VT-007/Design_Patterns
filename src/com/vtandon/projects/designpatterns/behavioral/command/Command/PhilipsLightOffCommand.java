package com.vtandon.projects.designpatterns.behavioral.command.Command;

import com.vtandon.projects.designpatterns.behavioral.command.receiver.PhilipsLight;

public class PhilipsLightOffCommand implements ICommand {

    PhilipsLight philipsLight;

    public PhilipsLightOffCommand(PhilipsLight philipsLight) {
        this.philipsLight = philipsLight;
    }

    @Override
    public void execute() {
        philipsLight.switchOff();
    }

    @Override
    public void unExecute() {
        philipsLight.switchOn();
    }
}
