package experiments;

public class Employee extends Person{

    String company;

    public Employee(String name, String lastName, String company) {
        super(name, lastName);
        this.company = company;
    }

    public void work() {
        System.out.printf("%s %s works in %s\n", getName(), getLastName(), company);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Work in company: " + company);
    }
}
