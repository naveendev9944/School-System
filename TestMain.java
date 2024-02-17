import java.util.*;
public class TestMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        School sh = new School();
        boolean loop = true;
        while(loop){
            System.out.println("1. Add a Teacher \n 2.Add a Student \n 3.Print the Students \n 4.Print the teacher");
            byte choice = sc.nextByte();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the teacher");
                    String name = sc.nextLine();
                    System.out.println("Enter the age");
                    byte age = sc.nextByte();
                    sc.nextLine();
                    System.out.println("Enter the State");
                    String State = sc.nextLine();
                    System.out.println("Enter the City");
                    String city = sc.nextLine();
                    System.out.println("Enter the Address");
                    String streetAddress = sc.nextLine();
                    System.out.println("Enter Your Gender \n 1.Male \n 2.Female");
                    byte gender = sc.nextByte();
                    Address address = new Address(State, city, streetAddress);
                    Teacher teacher = new Teacher(name, address, age, gender);
                    sh.addTeacher(teacher);
                    break;
                
                case 4:
                    System.out.println("Teachers List");
                    sh.getTeachers();
                default:
                    break;
            }

        }
        
        
    }
}
