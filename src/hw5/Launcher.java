package hw5;

public class Launcher {
    private static final int MIN_AGE = 40;
    private static final int EMPLOYEE_COUNT = 5;


    public static void main(String[] args) {
        Employee[] emplArray = new Employee[EMPLOYEE_COUNT];
        emplArray[0]= new Employee("Ivanov Ivan", "Engineer",
                "iviv@abc.com", "89123123123", 30000, 30);
        emplArray[1]= new Employee("Petrov Petr", "Engineer",
                "pepe@abc.com", "89234234234", 31000, 35);
        emplArray[2]= new Employee("Fedorov Fedor", "Engineer-Programmer",
                "fefe@abc.com", "89345345345", 33454, 43);
        emplArray[3]= new Employee("Nikolayev Nikolai", "Programmer",
                "nene@abc.com", "89454545454", 31123, 26);
        emplArray[4]= new Employee("Sergeev Sergei", "technician",
                "sese@abc.com", "89456456456", 45000, 50);


        for(Employee employee : emplArray){
            if(employee.getAge() >= MIN_AGE){
                employee.info();
                System.out.println("");
            }
        }
    }
}
