package com.vtandon.projects.designpatterns.behavioral.command;

import com.vtandon.projects.designpatterns.behavioral.command.concreteCommand.ActionListenerCommand;
import com.vtandon.projects.designpatterns.behavioral.command.concreteCommand.Command1;
import com.vtandon.projects.designpatterns.behavioral.command.concreteCommand.Command2;
import com.vtandon.projects.designpatterns.behavioral.command.invoker.Invoker1;
import com.vtandon.projects.designpatterns.behavioral.command.receiver.Receiver1;

public class Main {
    public static void main(String[] args) {
        Receiver1 receiver1 = new Receiver1();

        ActionListenerCommand clickOpen = new Command1(receiver1);
        ActionListenerCommand clickClose = new Command2(receiver1);

        Invoker1 invokerObj = new Invoker1(clickOpen, clickClose);
        invokerObj.triggerOpen();
        invokerObj.triggerCloe();
    }
}
