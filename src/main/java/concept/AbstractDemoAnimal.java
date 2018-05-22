package concept;

public class AbstractDemoAnimal {

    /*

    Abstract classes are classes that contain one or more abstract methods. An abstract method is a method that is declared,
    but contains no implementation.
     Abstract classes may not be instantiated, and require subclasses to provide implementations for the abstract methods.
     Let's look at an example of an abstract class, and an abstract method.

    Suppose we were modeling the behavior of animals, by creating a class hierachy that started with a base class called Animal.
    Animals are capable of doing different things like flying,
    digging and walking, but there are some common operations as well like eating and sleeping. Some common operations are
     performed by all animals, but in a different way as well. When an operation is performed in a different way,
     it is a good candidate for an abstract method (forcing subclasses to provide a custom implementation).
     Let's look at a very primitive Animal base class,
    which defines an abstract method for making a sound (such as a dog barking, a cow mooing, or a pig oinking).

    Now you may be wondering why not declare an abstract class as an interface, and have the Dog and Cow implement the interface.
    Sure you could - but you'd also need to implement the eat and sleep methods. By using abstract classes, you can inherit
    the implementation of other (non-abstract) methods. You can't do that with interfaces - an interface cannot provide
    any method implementations.

     */

    static class Food {

        String food;
        Food(String food){

            this.food =food;
        }

        String itEats(){

            return food;
        }
        void eat(){

            System.out.println(itEats());
        }
    }
    static public abstract class Animal {

        void eat(Food food){
            ;
            System.out.println(food.itEats());
        }

        abstract void makeSound();

    }

    static class Dog extends Animal{

        void makeSound(){
            System.out.println("Bark");
        }
    }

    static class Cow extends Animal{
        void makeSound(){
            System.out.println("Mow");
        }
    }

    public static void main(String[] args) {

        Food dogFood = new Food("meat");
        Dog d = new Dog();
        d.eat(dogFood);
        d.makeSound();

        Food cowFood = new Food("Grass");
        Cow c = new Cow();
        c.eat(cowFood);
        c.makeSound();

    }

}
