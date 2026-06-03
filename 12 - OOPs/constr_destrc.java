public class constr_destrc {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vaibhav";
        s1.roll = 564;
        s1.pass = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy
        s2.pass = "xyz";
        s1.marks[2] = 100;
        
        System.out.println("\nStudent 1 details....");
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.pass);
        for(int i=0; i<3; i++){
            System.out.println("Marks of student 1 of subject"+ i + ": " + s1.marks[i]);
        }
        
        System.out.println("\nStudent 2 details (Copy Constructor)....");
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.pass);
        for(int i=0; i<3; i++){
            System.out.println("Marks of student 2 of subject"+ i + ": " + s2.marks[i]);
        }
    }    
}

// Constructor
class Student {
    String name;
    int roll;
    String pass;
    int marks[];

    // Non-Parameterized Constructor
    Student(){
        marks = new int[3];
        System.out.println("Non-Parameterized Contructor is called....");
    }
    
    // Parameterized Constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
        System.out.println("Parameterized Constructor is called....");
    }

    // Shallow Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks; // changes will be reflected marks will be changed after student 2 is created and then marks are changed
    // }

    // Deep Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i]; // changes will not be reflected marks will be changed after student 2 is created and then marks are changed
        }
    }

}