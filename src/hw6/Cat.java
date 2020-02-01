package hw6;

public class Cat extends Animal{
    private static int catCount;
    boolean catcher;


    public Cat(String name, int weight, boolean catcher) {
        super(name, weight);
        this.catcher = catcher;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if((distance <= 200) && (distance > 0)){
            System.out.printf("Кот %s пробежал %d метров %n", getName(), distance );
        }else{
            System.out.println("Nah, let's nap!");
        }

    }

    @Override
    public void swim(int distance) {
        if(distance != 0){
            System.out.printf("Nah, let's nap!%n");
        }else{
            System.out.println("Nice! Let's nap.");
        }
    }

    public boolean getCatcher(){
        return catcher;
    }

    public static int getCatCount() {
        return catCount;
    }
}
