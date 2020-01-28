package hw5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(){

    }

    public Employee(String name, String position, String email, String phone, int salary, int age){
        setName(name);
        setPosition(position);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void info(){
        System.out.println("Имя Сотрудника: " + getName());
        System.out.println("Должность: " + getPosition());
        System.out.println("Email: " + getEmail());
        System.out.println("Тел.: " + getPhone());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Возраст: " + getAge());
    }
}
