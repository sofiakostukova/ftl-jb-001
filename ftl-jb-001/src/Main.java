import L013.SwitchExample;

import animals.Cat;
import animals.Dog;
import animals.Duck;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

        List<Dog> dogs = Dog.randomArray();
        for(int i = 0; i < dogs.size(); i++){
            System.out.println(dogs.get(i));
        }

        List<Dog> dogHomless = Arrays.asList(new Dog[]{
                Dog.ofHomless(2),
                Dog.ofHomless(3),
                Dog.ofHomless(5)
        });
        System.out.println(dogHomless.size());
        for(Dog dogItem : dogHomless){
            System.out.println(dogItem);
        }

        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.ofHomless(10));
        dogsLinkedList.add(Dog.ofHomless(10));
        dogsLinkedList.add(Dog.ofHomless(10));
        dogsLinkedList.add(Dog.ofHomless(10));
        dogsLinkedList.add(Dog.ofHomless(10));

        int indexLinkedList = 0;
        while (indexLinkedList < dogsLinkedList.size()){
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }

        for(int i = 0; i < 100; i++){
            SwitchExample.run();
        }


    }
}