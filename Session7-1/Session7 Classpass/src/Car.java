public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Blue";
    private int doors = 4;
    private boolean convertible = true;

    public void setMake(String make){
        if(make == null) {
            make = "unknown";
        }

        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "holden", "porsche", "telsa" -> this.make = make;
            default -> {
                this.make = "unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door" +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));

    }
}
