import java.time.LocalDate;

public class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;
    protected String ownerName;

    public Animal(String name, LocalDate birthDay, Illness illness, String ownerName){
        this.name = name; 
        this.birthDay = birthDay;
        this.illness = illness;
        this.ownerName = ownerName;
    }

    public Animal(){
        this("Вася", LocalDate.now(), new Illness("Болезнь"), "Ничей");
    }

    public void toGo() {
        System.out.println(getType() + " может ходить");
    }

    public void toFly() {
        System.out.println(getType() + " может летать");
    }

    public void toSwim() {
        System.out.println(getType() + " может плавать");
    }
    
    private void wakeUp(){
        System.out.println(getType() + " проснулся");
    }

    private void wakeUp(String time){
        System.out.println(getType() + " проснулся в " + time);
    }

    private void hunt(){
        System.out.println(getType() + " охотится");
    }

    private void eat(){
        System.out.println(getType() + " кушает");
    }
    
    private void slip(){
        System.out.println(getType() + " спит");
    }

    public void lifeCycle(){
        wakeUp();
        hunt();
        eat();
        slip();
    }

    public void setIllness(Illness illness){
        this.illness = illness;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Illness getIllness() {
        return illness;
    }
    
    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name =%s, birthday =%s, illness =%s", name, birthDay, illness);
    }
}