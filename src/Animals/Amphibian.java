package Animals;
public class Amphibian extends Animal{
    public Amphibian (String name, int age,String livingEnvironment) {
        super(name, age, livingEnvironment);
    }
    @Override
    public String toString() {
        return "Название земноводного: " + getName() +
                ". Возраст: "+ getAge() +
                " лет. Среда проживания: "+ getLivingEnvironment();
    }
    @Override
    public void toEat() {
        System.out.println("Кушает мелких зверей или насекомых");
    }
    @Override
    public void sleep() {
        System.out.println("Спит во влажных местах");
    }
    @Override
    public void moveAround() {
        System.out.println("Прыгает или ползает");
    }
    public void hunt(){ // метод охотиться
        System.out.println("Охотится методом засады");
    }
}