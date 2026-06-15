public class Main {

    public static void main(String[] args){

        Animal animal = new Animal("Generice Animal", "huge", 400);
        doAnimalStuff(animal, "slow");

        dog dog = new dog();
        doAnimalStuff(dog, "fast");

        dog yorkie = new dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast fast ");

        dog retriever = new dog("Retriver", 65, "Floopy", "Straight");
        doAnimalStuff(retriever, "slow");

        dog wolf = new dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2,3);
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
