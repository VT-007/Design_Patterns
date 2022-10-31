package com.vtandon.projects.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstanceThroughInnerClass();
        SingletonClass singletonClass2 = SingletonClass.getInstanceThroughInnerClass();
        System.out.println(singletonClass + " " + singletonClass2);

        SingletonClass singletonClass3 = SingletonClass.getInstanceLazyLoad();
        SingletonClass singletonClass4 = SingletonClass.getInstanceLazyLoad();
        System.out.println(singletonClass3 + " " + singletonClass4);

        SingletonClass singletonClass5 = SingletonClass.getInstanceLazyLoadThreadSafe();
        SingletonClass singletonClass6 = SingletonClass.getInstanceLazyLoadThreadSafe();
        System.out.println(singletonClass5 + " " + singletonClass6);

        SingletonClass singletonClass7 = SingletonClass.getInstanceLazyLoadThreadSafeDoubleCheck();
        SingletonClass singletonClass8 = SingletonClass.getInstanceLazyLoadThreadSafeDoubleCheck();
        System.out.println(singletonClass7 + " " + singletonClass8);
    }
}
