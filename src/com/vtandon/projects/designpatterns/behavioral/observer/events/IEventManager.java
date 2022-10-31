package com.vtandon.projects.designpatterns.behavioral.observer.events;

import com.vtandon.projects.designpatterns.behavioral.observer.subscribers.Listener;

import java.util.List;

public interface IEventManager {

    List<Listener> getAllListeners();

    void subscribe(Listener listener);

    void unsubscribe(Listener listener);

    void notifyListeners();

    void sendMessageToAllListeners(String message);
}
