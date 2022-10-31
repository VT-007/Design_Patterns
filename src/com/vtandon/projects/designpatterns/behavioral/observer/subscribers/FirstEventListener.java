package com.vtandon.projects.designpatterns.behavioral.observer.subscribers;

public class FirstEventListener implements Listener {

    @Override
    public void update() {
        System.out.println("First Listener called !!!");
    }

    @Override
    public void update(String message) {
        System.out.println("First Listener called with message :: " + message + " !!!");
    }
}
