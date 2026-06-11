public class Assignment {
    public static void main(String [] args){
        
        Vehicle obj1 = new Car();  // it will print derived class since points --> Car object -- method overriding
        obj1.print(); // Derived class - Method overriding
        // obj1.print1();   // Error- cannot find method print1() as reference variable is Vehicle 
        
        Vehicle obj2 = new Vehicle(); // normal object since only access Vehicle object
        obj2.print(); // Base Class
        
        System.out.println(Book.count); // --> can be called - output : 0 (No error)
        
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a + Test.b); // 40
        

    }
}


class Vehicle{
    void print(){
        System.out.println("Base class (Vehicle)");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived class (Car)");
    }
    void print1(){
        System.out.println("Derived class (Car)");
    }
}

class Book{
    int price;
    static int count;
}

class Test {
    static int a=10;
    static int b;
    static void changeB(){
        b = a*3;
    }
}
