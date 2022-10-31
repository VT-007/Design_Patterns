package com.vtandon.projects.designpatterns.behavioral.command;

import com.vtandon.projects.designpatterns.behavioral.command.Command.*;
import com.vtandon.projects.designpatterns.behavioral.command.invoker.PhilipsInvoker;
import com.vtandon.projects.designpatterns.behavioral.command.receiver.PhilipsFan;
import com.vtandon.projects.designpatterns.behavioral.command.receiver.PhilipsLight;

public class Main {
    // here Main class is working as an Invoker
    public static void main(String[] args) {

        ICommand philipsFanSwitchOnCommand = new PhilipsFanOnCommand(new PhilipsFan());
        ICommand philipsFanSwitchOffCommand = new PhilipsFanOffCommand(new PhilipsFan());
        ICommand philipsLightSwitchOnCommand = new PhilipsLightOnCommand(new PhilipsLight());
        ICommand philipsLightSwitchOffCommand = new PhilipsLightOffCommand(new PhilipsLight());

        PhilipsInvoker philipsInvoker = new PhilipsInvoker(philipsFanSwitchOnCommand, philipsFanSwitchOffCommand);
        philipsInvoker.executeCommand(philipsFanSwitchOnCommand);
        philipsInvoker.executeCommand(philipsFanSwitchOffCommand);

        PhilipsInvoker philipsInvoker1 = new PhilipsInvoker(philipsLightSwitchOnCommand, philipsLightSwitchOffCommand);
        philipsInvoker1.executeCommand(philipsLightSwitchOnCommand);
        philipsInvoker1.executeCommand(philipsLightSwitchOffCommand);

    }
}
