import animals.Cat;
import animals.Dog;
import animals.Duck;

public class Main {
    public static void main(String[] args) {
//        HelloWorld.run();
//        POJO.run();
//
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//
//        L004.Cat catL004 = new L004.Cat();
//        catL004.voice();

        Cat cat = new Cat("Barsik", 20);
        System.out.println(cat.jumpHeight());
        cat.voice();

        Dog dog = new Dog();

        dog.goToStick(14);
        dog.whereTheDog();

        dog.goToStick(20);
        dog.whereTheDog();

        dog.goToStick(5);
        dog.whereTheDog();

        dog.voice();

        Dog homlessDog = Dog.ofHomless(100);
        homlessDog.voice();

        Duck duck = new Duck();
        duck.voice();

        duck.takeOff();
        duck.isTheBirdFlying();
        duck.showSpeed();

        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();

        Dog[] dogHomless = new Dog[]{
                Dog.ofHomless(2),
                Dog.ofHomless(3),
                Dog.ofHomless(5)
        };
        System.out.println(dogHomless.length);
        System.out.println(dogHomless[0]);
        System.out.println(dogHomless[1]);
        System.out.println(dogHomless[2]);

        Dog[] dogs = Dog.randomArray();
        System.out.println(dogs[0]);
        System.out.println(dogs[1]);
        System.out.println(dogs[2]);
    }
}