class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}
interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}


public class Que5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}

