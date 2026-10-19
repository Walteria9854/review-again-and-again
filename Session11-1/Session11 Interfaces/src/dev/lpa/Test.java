package dev.lpa;

public class Test {

    public static void main(String[] args) {

        inFlight(new jet());

        //OrbitEarth.log("testing" + new Satellite());

        orbit(new Satellite());




    }


    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStagese.LANUCH);
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier){
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
