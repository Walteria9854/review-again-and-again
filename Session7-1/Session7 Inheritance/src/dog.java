public class dog extends Animal{

    private String earShape;
    private String tailShape;

    public dog(){
        super("Mutt", "Big", 50);

    }

    public dog(String type, double wieght){
        this(type, wieght,"Perky", "Curled");
    }
    public dog(String type, double wieght, String earShape, String tailShape) {
        super(type,
                wieght < 15 ? "small" : (wieght < 35 ? "medium" : "large"),
                wieght);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("!wooooooooooooooooooooo");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();


    }

    public void bark(){
        System.out.println("Woof Woof");
    }

    public void run(){
        System.out.println("Dog running");
    }

    public void walk(){
        System.out.println("Dog Walking");
    }

    public void wagTail(){
        System.out.println("Tail Wagging");
    }
}
