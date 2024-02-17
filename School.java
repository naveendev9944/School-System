import java.util.*;


class SchoolManagement {
   
}


class School {
    //Private Repository for students and teachers
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    // Getters and setters
    public void getTeachers(){
        for(Teacher teacher: this.teachers){
            System.out.println(teacher.name + " " + teacher.age + " " + teacher.address);
        }
    }

    public void getStudents(){
        for(Student student: this.students){
            System.out.println(student.name + " " + student.age + " " + student.address);
        }
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
        System.out.println("Added a Teacher Successfully");
    }

    public void addStudent(Student student) {
        this.students.add(student);
        System.out.println("Added a Student Successfully");
    }

    // public static double calculateMonthlyProfit(){}
}

class Person {
    String name;
    Address address;
    byte age;
    Gender gender; 

    public Person(String name , Address address, byte age, byte gender ){
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = Gender.values()[gender-1];
    }
}


class Student extends Person {
    
    public Student(String name , Address address, byte age, byte gender ){
        super(name,address,age,gender);
    }
    
    // public double getMonthlyFee(){}

}

class Teacher extends Person {
    public Teacher(String name , Address address, byte age, byte gender ){
        super(name,address,age,gender);
    }
    // public double getMonthlySalary()
}


class Address {
   private String State;
   private String City;
   private String StreetName;

   public Address(String State, String City, String StreetName){
    this.State = State;
    this.City = City;
    this.StreetName = StreetName;
   }

    
}

enum Gender {
    Male,
    Female
};