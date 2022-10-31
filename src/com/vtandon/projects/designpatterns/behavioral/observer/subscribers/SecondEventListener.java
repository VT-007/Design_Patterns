package com.vtandon.projects.designpatterns.behavioral.observer.subscribers;

public class SecondEventListener implements Listener {
    @Override
    public void update() {
        System.out.println("Second Listener called !!!");
    }

    @Override
    public void update(String message) {
        System.out.println("Second Listener called with message :: " + message + " !!!");
    }
}
