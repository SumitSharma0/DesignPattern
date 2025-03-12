package org.example.creational.singleton.builder;

public class Car {

    private final String engine;
    private final int wheels;
    private final String color;

    // 1 Private constructor to enforce the use of the builder
    private Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.color = carBuilder.color;
    }

    //2 Getters
    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    //3 Builder class
    public static class CarBuilder {
        private String engine;
        private int wheels;
        private String color;

        //4 Setter methods for each field, returning the builder for chaining
        public CarBuilder getEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder getWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder getColor(String color) {
            this.color = color;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
