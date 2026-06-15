public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(){}

    public Fish(String type, double wieght, int gills, int fins) {
        super(type, "small", wieght);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.print("muscles moving ");

    }

    private void moveBackFins(){
        System.out.print("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
           moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
