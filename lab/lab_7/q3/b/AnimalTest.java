package lab.lab_7.q3.b;

public class AnimalTest {
    public static void main(String[] args){

    // Polymorphism approach
    Animal[] animals = {
        new Dog("paul"),
        new Dog("james"),
        new Cat("lyon"),
        new Cat("tyson"),
        new Sheep("john"),
        new Sheep("seong woo")
    };
    
    System.out.println("All, Cry---------");
    for(Animal animal: animals){
        animal.cry();
    }

     // Non-Polymorphism approach
    System.out.println("CuteBoy, Cry---------");
    Dog nonPolyDog = new Dog("CuteBoy");
    nonPolyDog.cry();

    }
}
