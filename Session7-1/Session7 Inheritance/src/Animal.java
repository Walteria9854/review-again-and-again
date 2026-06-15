public class Animal {

    protected String type;
    private String size;
    private double wieght;

    public Animal(){

    }

    public Animal(String type, String size, double wieght) {
        this.type = type;
        this.size = size;
        this.wieght = wieght;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", wieght=" + wieght +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " Moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " make some kind of noise");
    }



}
