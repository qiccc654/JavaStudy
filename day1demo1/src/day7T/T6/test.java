package day7T.T6;

public class test {
    public static void main(String[] args) {
        Animal cat = new Cat("tom", "灰白");
        Animal dog = new Dog("旺财", 5);
        Animal bird = new Bird("樱桃", 21.76);
        cat.makeSound();
        cat.move();
        dog.makeSound();
        dog.move();
        bird.makeSound();
        bird.move();



    }
}
