class Person{
    private String name;
    String gender;
    String address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person's name is " +name+ "who is a " +gender+ "of" +age+ "years of age and lives at" +address;
    }
}

class Employee extends Person{
    String employeeId;
    String company_name;
    String qualification;
    int salary;

    public Employee(String name, String gender, String address, int age, String employeeId, String company_name, String qualification, int salary) {
        super(name, gender, address, age);
        this.employeeId = employeeId;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }

    
}

public class PersonDemo {
    
}
