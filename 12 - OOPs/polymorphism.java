public class polymorphism {
    public static void main(String[] args) {
    
        // Compile Time Polymorphism / Static Polymorphism --> Method Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1, 2, 3));

        // Run Time Polymorphism / Dynamic Polymorphism --> Method Overriding
        deer d = new deer();
        d.eat();
    }
}

// Compile Time Polymorphism / Static Polymorphism --> Method Overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

// Run Time Polymorphism / Dynamic Polymorphism --> Method Overriding
class Animal{
    void eat(){
        System.out.println("Eats Anything....");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Eats grass....");
    }
}