import java.time.LocalDate;

public class Duck extends Bird {
    public Duck() {super();}

    public Duck(String name, LocalDate birthday, Illness illness, String ownerName) {
        super(name, birthday, illness, ownerName);
    }

    @Override //переопределение метода
    public void toSwim() {
        System.out.println(this.getClass().getSimpleName() + " может плавать");
    }
}