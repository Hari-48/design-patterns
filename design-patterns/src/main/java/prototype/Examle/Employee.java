package prototype.Examle;

public class Employee implements Prototype{

    private String name ;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    private String department;

    @Override
    public Prototype clone() {
        return new Employee(name,department);
    }

    public void showDetails(){
        System.out.println("Employee Name is "+this.name + "and He is From " + this.department + "department");
    }
}
