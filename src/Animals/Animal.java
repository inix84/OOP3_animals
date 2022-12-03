package Animals;
import java.util.Objects;
public abstract class Animal {
    private String name;// кличка
    private int age; // кол. лет
    private String livingEnvironment; // среда обитания

    public Animal(String name, int age,String livingEnvironment) {
        this.name = validOrDefault(name, "неизвестен");
        this.age = age >= 0 ? age : 0;
        this.livingEnvironment=validOrDefault(livingEnvironment,"неизвестно");
    }

    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }
    public abstract void toEat(); // кушать
    public abstract void sleep(); // спать
    public abstract void moveAround(); // перемещаться

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
    @Override
    public String toString() {
        return "Животное " +
                "кличка " + getName() +
                ", возраст " + getAge() ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animal animals = (Animal) o;
        return age == animals.age && name.equals(animals.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}