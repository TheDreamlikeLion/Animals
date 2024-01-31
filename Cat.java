import java.time.LocalDate;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness, "ничей");
    }

    @Override //переопределение метода
    public void toFly() {
        System.out.println(this.getClass().getSimpleName() + " не может летать");
    }
}