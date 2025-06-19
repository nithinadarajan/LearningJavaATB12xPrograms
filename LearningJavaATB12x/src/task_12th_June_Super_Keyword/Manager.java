package task_12th_June_Super_Keyword;

public class Manager extends Employee{
    @Override
    void showDetails() {
        super.showDetails(); // Call parent class method
        System.out.println("Role: Manager");
        System.out.println("Department: Sales");
    } 

}
