public class abstraction {
    public static void main(String[] args) {
        /*
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);  // Animal contructor will be called = "brown"
        */

        // Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang

        // Interface - Object
        Queen q = new Queen();
        q.moves();
    
        // Multiple inheritance eg....
        Bear b = new Bear();
        b.eatPlants();
        b.eatMeat();
    }
}

// ABSTRACT CLASS ------------------------------------------------------->
abstract class Animal{
    String color;
    // constructor can be made --
    Animal(){
        // color = "brown";
        System.out.println("Animal constructor is called....");
    }
    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called....");
    }
    // compulsorily "walk()" needs to be implemented
    void walk(){
        System.out.println("Walks on 4 legs....");
    }
    void colorChange(){
        color = "dark brown";
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called....");
    }
}
class Chicken extends Animal{
    // compulsorily "walk()" needs to be implemented
    void walk(){
        System.out.println("Walks on 2 legs....");
    }
}

// INTERFACE ---------------------------------------------------------->
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal (in all 4 directions)");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal - (by 1 step)");
    }
}

// Multiple inheritance eg ---->
interface Herbivore {
    void eatPlants();
}
interface Carnivore {
    void eatMeat();
}
class Bear implements Herbivore, Carnivore{
    public void eatPlants(){
        System.out.println("Eats berries and roots");
    }
    public void eatMeat(){
        System.out.println("Eats fish..");
    }
}