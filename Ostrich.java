import java.time.LocalDate;

public class Ostrich extends Bird {
    public Ostrich() {super();}

    public Ostrich(String name, LocalDate birthday, Illness illness, String ownerName) {
        super(name, birthday, illness, ownerName);
    }

    @Override //переопределение метода
    public void toSwim() {
        System.out.println(this.getClass().getSimpleName() + " не может плавать");
    }
    @Override
    public void toFly() {
        System.out.println(this.getClass().getSimpleName() + " не может летать");
    }
}