package animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{

    public Dog(String name, Integer weight){
        super(name, weight);
    }

    public Dog()
    {

    }

    public  static  List<Dog> randomArray(){
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Sharik", 3));
        dogs.add(Dog.of("Bubble", 1));
        dogs.add(Dog.of("Tuzic", 5));

        return dogs;
    }

    /**
     * Идем до позиции палки. Чтобы дойти до палки, нужно определеть разницу между текущей позицией и позицией палки.
     * @param stickPosition
     */
    public void goToStick(Integer stickPosition){
        Integer delta = stickPosition - this.currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog(){
        System.out.println(this.currentPosition);
    }

    public static Dog of(String name, Integer weight){
        return new Dog(name, weight);
    }

    public static Dog ofHomless(Integer weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice(){
        System.out.println("wow!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
