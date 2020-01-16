package hw1;

public class Worker {
    byte var1 = 127;
    short var2 = 32767;
    int var3 = 1234567;
    long var4 = 1234567;

    float var5 = 12.12f;
    double var6 = -12.12;

    char var7 = 'd';
    boolean var8 = true;

    Object var9 = new Object();

    public float example(float a, float b, float c, float d) throws ArithmeticException{
        return a * (b +(c / d));
    }

    public boolean tenTwenty(int a, int b){
        if (((a + b) >= 10)&&((a + b) <= 20)){
            return true;
        }else{
            return false;
        }
    }

    public void posNeg(int a){
        if (a >= 0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }

    public boolean checkNeg(int a){
        if(a < 0){
            return true;
        }else{
            return false;
        }
    }

    public void hello(String name){
        System.out.println("Привет, " + name);
    }

    public void bissextile(int year){
        if ((year % 4) == 0){
            if(((year % 100) == 0) && ((year % 400) != 0)){
                System.out.println("год не високосный");
            }else{
                System.out.println("год високосный");
            }
        }else{
            System.out.println("год не високосный");
        }
    }

}
