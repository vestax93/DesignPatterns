package prototype;

public class EmployeeRecord implements Prototype {
    private int id;
    private String name;
    private String designation;
    private double salary;
    private String address;

    public EmployeeRecord() {
    }

    public EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public String showRecord(){
        return "ID: " + id + " name: " + name + " designation: " + designation + " salary: " + salary + " address: " + address;
    }

    @Override
    public Prototype getClone() { //pravimo klona trenutnog objekta tako sto pozivamo konstruktor i prosledjujemo mu podatke iz ovog objekta
        //getClone ne prima nista kao parametar, vec uzima podatke iz onog objekta u kome se nalazi
        return new EmployeeRecord(this.id,this.name,this.designation,this.salary,this.address);
    }
}
