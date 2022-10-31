package com.vtandon.projects.designpatterns.creational.singleton;

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {

    }

    public static class InnerClass {
        private static final SingletonClass SINGLETON_INSTANCE = new SingletonClass();
    }

    public static SingletonClass getInstanceThroughInnerClass() {
        return InnerClass.SINGLETON_INSTANCE;
    }


    public static SingletonClass getInstanceLazyLoad() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public synchronized static SingletonClass getInstanceLazyLoadThreadSafe() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public static SingletonClass getInstanceLazyLoadThreadSafeDoubleCheck() {
        synchronized (SingletonClass.class) {
            if (singletonClass == null) {
                singletonClass = new SingletonClass();
            }
        }
        return singletonClass;
    }


}
