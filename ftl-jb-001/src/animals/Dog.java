package animals;

public class Dog extends Animal{

    public Dog(String name, Integer weight){
        super(name, weight);
    }

    public Dog()
    {

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
}