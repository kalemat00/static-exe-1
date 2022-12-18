package it.project.classes;
import lombok.Data;

@Data
public class Employee {
    private String name;
    private String surname;
    private String address;

    public Employee(String name, String surname, String address){
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getEmployeeDetails(){
        return "Employee Details: \n" +
                "Name : " + this.name + ",\n" +
                "Surname : " + this.surname + ",\n" +
                "Address : " + this.address + ".";
    }
}
