import java.time.LocalDate;

public class Fish extends Animal {
    public Fish() {super();}

    public Fish(String name, LocalDate birthday, Illness illness, String ownerName) {
        super(name, birthday, illness, ownerName);
    }

    @Override
    public void toFly() {
        System.out.println(this.getClass().getSimpleName() + " не может летать");
    }

    @Override
    public void toGo() {
        System.out.println(this.getClass().getSimpleName() + " не может ходить");
    }
}