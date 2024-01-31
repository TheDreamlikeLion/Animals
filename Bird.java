import java.time.LocalDate;

public class Bird extends Animal {
    public Bird() {super();}

    public Bird(String name, LocalDate birthday, Illness illness, String ownerName) {
        super(name, birthday, illness, ownerName);
    }

    @Override //переопределение метода
    public void toSwim() {
        System.out.println(this.getClass().getSimpleName() + " не может плавать");
    }
}