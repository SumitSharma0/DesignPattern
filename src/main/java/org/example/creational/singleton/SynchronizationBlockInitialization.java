package org.example.creational.singleton;

public class SynchronizationBlockInitialization {
    private static SynchronizationBlockInitialization instance;

    private SynchronizationBlockInitialization() {
    }

    public static synchronized SynchronizationBlockInitialization getInstance(){
        if(instance == null){
            instance = new SynchronizationBlockInitialization();
        }
        return instance;
    }
}
