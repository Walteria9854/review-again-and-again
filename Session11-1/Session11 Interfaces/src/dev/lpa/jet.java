package dev.lpa;

public class jet implements FlightEnabled, Trackable{
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");

    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");

    }

    @Override
    public FlightStagese transition(FlightStagese stage) {
        System.out.println(getClass().getSimpleName() + " transitiing");
        return FlightEnabled.super.transition(stage);


    }
}
