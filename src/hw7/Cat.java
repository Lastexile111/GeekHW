package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if((p.info() >= appetite)&&(satiety == false)) {
            p.decreaseFood(appetite);
            satiety = true;
        }else{
            System.out.println(name + ":*разочарованное мяу*");
        }
    }

    public void info(){
        System.out.printf("%s: %b", name, satiety);
    }


}
