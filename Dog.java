import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, LocalDate birthDay, Illness illness, String ownerName) {
        super(name, birthDay, illness, ownerName);
    }

    @Override //переопределение метода
    public void toFly() {
        System.out.println(this.getClass().getSimpleName() + " не может летать");
    }
}