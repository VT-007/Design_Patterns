package com.vtandon.projects.designpatterns.behavioral.observer.events;

import com.vtandon.projects.designpatterns.behavioral.observer.subscribers.Listener;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements IEventManager {

    List<Listener> listenerList = new ArrayList<>();

    @Override
    public List<Listener> getAllListeners() {
        return listenerList;
    }

    @Override
    public void subscribe(Listener listener) {
        listenerList.add(listener);
    }

    @Override
    public void unsubscribe(Listener listener) {
        listenerList.remove(listener);
    }

    @Override
    public void notifyListeners() {
        for (Listener listener :  listenerList) {
            listener.update();
        }
    }

    @Override
    public void sendMessageToAllListeners(String message) {
        for (Listener listener :  listenerList) {
            listener.update(message);
        }
    }
}
