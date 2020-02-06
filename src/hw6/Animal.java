package hw6;

public abstract class Animal {
    private static int animalCount;
    private String name;
    private int weight;

    public Animal(){
        animalCount++;
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run(int distance){
        System.out.printf("Животное %s пробежало %d метров", getName(), distance );
    }

    public void swim(int distance){
        System.out.printf("Животное %s проплыло %d метров", getName(), distance );
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
