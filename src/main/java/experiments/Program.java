package experiments;

public class Program {

    public static void main(String[] args) {
        Person tom = new Person("Tom", "Wais");
        tom.display();

        Employee sam = new Employee("Sam", "Black", "Tel-Ran");
        sam.display();
        sam.work();
    }
}
