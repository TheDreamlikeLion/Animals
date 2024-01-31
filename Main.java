import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020,03,20), new Illness("Лишай"), "Коля");
        System.out.println(cat.getName());
        Animal animal = new Animal();
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        Animal dog = new Dog("Персик", LocalDate.of(2020,02,10), new Illness("Лишай"), "Василий");
        System.out.println(dog.illness);
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Ласточка", LocalDate.of(2020,03,20),new Illness("Лишай"), "Дикий"));
        System.out.println(list);
        dog.lifeCycle();

        Bird bird = new Bird();
        bird.setName("Иволга");
        Fish fish = new Fish();
        fish.setName("Гуппи");

        bird.toSwim();
        bird.toFly();
        bird.toGo();

        fish.toSwim();
        fish.toFly();
        fish.toGo();

        Bird bird2 = new Duck();
        bird2.setName("Утка");
        Fish fish2 = new FlyingFish();
        fish2.setName("Летающая рыба");

        bird2.toSwim();
        bird2.toFly();
        bird2.toGo();

        fish2.toSwim();
        fish2.toFly();
        fish2.toGo();

        Animal snake = new Snake();
        snake.setName("Змея");

        snake.toSwim();
        snake.toFly();
        snake.toGo();

        Bird bird3 = new Ostrich();
        bird3.setName("Страус");

        bird3.toSwim();
        bird3.toFly();
        bird3.toGo();
    }

}