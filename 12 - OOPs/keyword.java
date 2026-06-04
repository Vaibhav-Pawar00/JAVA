public class keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schooName = "JMV";
        // changed to every object until not changed

        Student s2 = new Student();
        System.out.println(s2.schooName); 
        // should print empty string but prints "JMV" 

        // super keyword example ---->
        Horse h1 = new Horse();
    }
}

// Static keyword example ----------------------------------------->
class Student{
    String name;
    int roll;

    static String schooName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    static int percentage(int phys, int chem, int maths){
        return (phys + chem + maths) / 3;
    }
}

// Super keyword exaple ------------------------------------------>
class Animal{
    Animal(){
        System.out.println("Animal constructor is called....");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor is called....");
    }
}