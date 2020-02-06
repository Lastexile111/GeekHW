package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void addFood(int n){
        this.food += n;
    }
    public void decreaseFood(int n) {
        if(food >= n ) {
            food -= n;
        }else{
            System.out.println("корма не может остаться отрицательное количество");
        }
    }
    public int info(){
        System.out.println("plate: " + food);
        return food;
    }
}
