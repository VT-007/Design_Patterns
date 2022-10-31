package com.vtandon.projects.designpatterns.behavioral.observer.subscribers;

public interface Listener {

    void update();

    void update(String message);
}
