package hw6;

public class Dog extends Animal{
    private static int dogCount;
    private String bark;

    public Dog(String name, int weight, String barkType){
        super(name, weight);
        this.bark = barkType;
        dogCount++;
    }

    @Override
    public void run(int distance){
        if((distance <= 500) && (distance > 0)){
            System.out.printf("Пес %s пробежал %d метров %n", getName(), distance );
        }else{
            System.out.println("I'm sorry! But I cant!(");
        }

    }

    @Override
    public void swim(int distance){
        if((distance <= 10) && (distance > 0)){
            System.out.printf("Пес %s проплыл %d метров %n", getName(), distance );
        }else{
            System.out.println("I'm sorry! But I cant!(");
        }

    }

    public String getBark(){
        return bark;
    }

    public static int getDogCount(){
        return dogCount;
    }
}
