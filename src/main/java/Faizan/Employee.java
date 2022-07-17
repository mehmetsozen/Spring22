package Faizan;

public class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}
class EmployeeInfo {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.setName("Mehmet");
        em.salary = 1200;
        System.out.println("The name of the person is "+em.getName());
        System.out.println("The salary of the person is "+em.getSalary());
    }
}
