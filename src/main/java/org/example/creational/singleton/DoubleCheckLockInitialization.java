package org.example.creational.singleton;

public class DoubleCheckLockInitialization {

    private static volatile DoubleCheckLockInitialization instance;

    private DoubleCheckLockInitialization(){}

    public static DoubleCheckLockInitialization getInstance() {
        if(instance == null){
            synchronized (DoubleCheckLockInitialization.class){
                if (instance == null){
                    instance = new DoubleCheckLockInitialization();
                }
            }
        }
        return instance;
    }
}
