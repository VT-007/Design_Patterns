package com.vtandon.projects.designpatterns.behavioral.observer;

import com.vtandon.projects.designpatterns.behavioral.observer.events.EventManager;
import com.vtandon.projects.designpatterns.behavioral.observer.subscribers.FirstEventListener;
import com.vtandon.projects.designpatterns.behavioral.observer.subscribers.Listener;
import com.vtandon.projects.designpatterns.behavioral.observer.subscribers.SecondEventListener;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        //add subscribers/listeners
        Listener firstListener = new FirstEventListener();
        Listener secondListener = new SecondEventListener();
        eventManager.subscribe(firstListener);
        eventManager.subscribe(secondListener);

        //publish an event
        int a = 0;
        while(a != 6) {
            if(a == 5) {
                eventManager.notifyListeners();
            }
            a++;
        }

        eventManager.unsubscribe(secondListener);
        eventManager.notifyListeners();
    }
}
