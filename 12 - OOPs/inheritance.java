public class inheritance {
    public static void main(String[] args) {

        // Single level Inheritance -------------------------------->
        Fish shark = new Fish();
        shark.eat();

        // Multi level Inheritance --------------------------------->
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

        // Hierarchial Inheritance --------------------------------->
        // Class FISH & MAMMAL & BIRD ---> under ANIMAL class
        //         "ANIMAL"
        //       /     |    \
        //     FISH  MAMMAL  BIRD     

        // Hybrid Inheritance --------------------------------------->
        // Class FISH & MAMMAL & BIRD comes under ANIMAL class and Dog class comes under MAMMAL
        //         "ANIMAL"
        //       /     |    \
        //     FISH  MAMMAL  BIRD
        //             |
        //            Dog

        // Multiple Inheritance ------------------------------------->
        // -->  "INTERFACES" are used instead of "CLASSES"
        //       MAMMAL     BIRD          
        //          \       /
        //            "BAT"
    }
}
// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

// Derived Class or Subclass of Animal / base class / Single level Inheritance
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water..");
    }
}

// Multi level Inheritance
// 1st - derived class of Animal
class Mammal extends Animal{
    int legs;
}
// 2nd - derived class of Mammal 
class Dog extends Mammal{
    String breed;
}

// Hierarchial Inheritance
// Class FISH & MAMMAL & BIRD ---> under ANIMAL class
//         "ANIMAL"
//       /     |    \
//     FISH  MAMMAL  BIRD     
class Bird extends Animal{
    void fly(){
        System.out.println("Can fly....");
    }
}

