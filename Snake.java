import java.time.LocalDate;

public class Snake extends Animal {
    public Snake(String name, LocalDate birthDay, Illness illness, String ownerName) {
        super(name, birthDay, illness, ownerName);
    }

    public Snake() {super();}

    @Override //переопределение метода
    public void toFly() {
        System.out.println(this.getClass().getSimpleName() + " не может летать");
    }

    @Override //переопределение метода
    public void toGo() {
        System.out.println(this.getClass().getSimpleName() + " не может ходить");
    }
}