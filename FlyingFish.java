import java.time.LocalDate;

public class FlyingFish extends Fish {
    public FlyingFish() {super();}

    public FlyingFish(String name, LocalDate birthday, Illness illness, String ownerName) {
        super(name, birthday, illness, ownerName);
    }

    @Override
    public void toFly() {
        System.out.println(this.getClass().getSimpleName() + " может летать");
    }
}