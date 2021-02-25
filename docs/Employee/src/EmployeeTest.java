import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee p1 = new Employee();
        Employee p2 = new Employee(new Date(7/11/2021), "elisa veronesi");

        System.out.println("p2 -> " + p1.toString());
        p2.setEmployee("carlo", new Date(8/11/2021));

        System.out.println("p2 -> " + p2.toString());

        if (p1.equals(p2)){
            System.out.println("sono uguali");
        } else{
            System.out.println("non sono uguali");
        }

    }
}