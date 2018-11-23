package com.builder_30;

/**
 * Created by Daniel_D'AGE on 13.11.2018.
 * Tworzenie obiektu poprzez konstruktor Builder, ni potrzebujemy miec metod set, które ustawiają nam wartośc pól,
 *
 */
public class Vehicle {

    private Integer id;
    private String mark;
    private Integer wheels;
    private Integer airbags;
    private Integer maxSpeed;
    private String registration;

    public static class Builder {

        private Integer id = null;
        private String mark = null;
        private Integer wheels = null;
        private Integer airbags = null;
        private Integer maxSpeed = null;
        private String registration = null;


        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder mark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder wheels(Integer wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder airbags(Integer airbags) {
            this.airbags = airbags;
            return this;
        }

        public Builder maxSpeed (Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder registration (String registration) {
            this.registration = registration;
            return this;
        }

        public Vehicle build(){
            return  new Vehicle(this);
        }

    }

        private Vehicle (Builder builder){ //prywatny konstruktor
            this.id = builder.id;
            this.mark = builder.mark;
            this.wheels = builder.wheels;
            this.airbags = builder.airbags;
            this.maxSpeed = builder.maxSpeed;
            this.registration = builder.registration;
        }

    public Integer getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public Integer getWheels() {
        return wheels;
    }

    public Integer getAirbags() {
        return airbags;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public String getRegistration() {
        return registration;
    }
}

