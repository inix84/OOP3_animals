package Animals;
public class NotFlying extends Bird {
    public NotFlying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment, movementType);
    }
    @Override
    public String toString() {
        return "Название НЕ летающей птицы: "+ getName() +
                ". Возраст: "+ getAge() +
                " лет. Среда проживания: " +getLivingEnvironment()+
                ". Тип перемещения: " + movementType;
    }
    public void toEat() {
        System.out.println("Рыбку или зерно");
    }
    public void sleep() {
        System.out.println("На снегу или лужайке");
    }
    public void moveAround() {
        System.out.println("Бегает");
    }
    public void hunt() {
        System.out.println("Не охотятся");
    }
    public void walking() {
        System.out.println("На просторах");
    }
}