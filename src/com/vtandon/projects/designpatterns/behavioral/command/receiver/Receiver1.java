package com.vtandon.projects.designpatterns.behavioral.command.receiver;

public class Receiver1 {
    public void open() {
        System.out.println("Received Open command");
    }

    public void close() {
        System.out.println("Received close command");
    }
}
