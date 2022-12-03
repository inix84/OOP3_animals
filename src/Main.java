//import package Animals;
import Animals.*;
public class Main {
    public static void main(String[] args) {
        Animal gazelle = new Herbivore("Газель", 2, "Саванна", 5, "Трава");
        Animal giraffe = new Herbivore("Жираф", 5, "Саванна", 3, "Трава");
        Animal horse = new Herbivore("Лошадь", 10, "Степь", 6, "Трава");
        Animal hyena = new Predator("Гиена", 4,"Пустыня",4,"Животные и падаль");
        Animal tiger = new Predator("Тигр", 10, "Саванна", 4, "Животные");
        Animal bear = new Predator("Медведь", 15 ,"Лес", 5,"Животные и ягоды");
        Animal frog = new Amphibian("Лягушка", 1,"Река");
        Animal snakeFrashwater = new Amphibian("Уж пресноводный", 2,"Влажные места");
        Animal peacock = new NotFlying("Павлин",2,"Степь","Хождение");
        Animal penguin = new NotFlying("Пингвин",4,"Арктика","Хождение");
        Animal dodoBird = new NotFlying("Птица Додо",3,"Остров","Хождение");
        Animal gull = new Flying("Чайка", 2, "Около берега", "Полет" );
        Animal albatros = new Flying("Альбатрос", 3,"Около берега","Полет");
        Animal falcon = new Flying("Сокол", 2, "Степь", "Полет");
        System.out.println(gazelle);
        gazelle.toEat(); // кушать
        gazelle.sleep();
        gazelle.moveAround(); // перемещаться
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(snakeFrashwater);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(gull);
        System.out.println(albatros);
        System.out.println(falcon);
        System.out.println(gazelle.equals(giraffe));
        System.out.println(giraffe.equals(horse));
        System.out.println(horse.equals(giraffe));
        System.out.println(gazelle.equals(hyena));
    }
}