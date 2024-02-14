package prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int id = Integer.parseInt(br.readLine());
        String name = br.readLine();
        String designation = br.readLine();
        double salary = Double.parseDouble(br.readLine());
        String address = br.readLine();

        EmployeeRecord e1 = new EmployeeRecord(id,name,designation,salary,address);
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone(); //kloniramo, ali posto je povratna vrednost Prototype moramo da castujemo u odgovarajucu klasu

        System.out.println(e1.showRecord());
        System.out.println(e2.showRecord());
    }
}
