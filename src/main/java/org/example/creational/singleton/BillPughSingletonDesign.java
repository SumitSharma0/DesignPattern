package org.example.creational.singleton;

public class BillPughSingletonDesign {

    private BillPughSingletonDesign(){
    }

    private static class SingletonHelper{
        private static final BillPughSingletonDesign instance = new BillPughSingletonDesign();
    }

    public static BillPughSingletonDesign getInstance(){
        return SingletonHelper.instance;
    }
}
