public class Main {
    public static void main(String[] args) {
        //Zadanie 1 i 2
        Car car = new Car();
        car.start();
        car.stop();

        System.out.println("================================");
        //Zadanie 3 i 4
Lion lion = new Lion();
Cat cat = new Cat();
Dog dog = new Dog();
Wolf wolf = new Wolf();

lion.makeNoise();
lion.roam();
lion.sleep();

cat.makeNoise();
cat.roam();
cat.sleep();

dog.makeNoise();
dog.roam();
dog.sleep();

wolf.makeNoise();
wolf.roam();
wolf.sleep();

    }
}