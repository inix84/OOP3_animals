package Animals;
public class Herbivore extends Mammal{
          public Herbivore(String name, int age, String livingEnvironment, int speedMove, String foodType) {
            super(name, age, livingEnvironment, speedMove,foodType);
        }
        @Override
        public String toString() {
            return "Название травоядного животного: "+ getName() +
                    ". Возраст: "+ getAge() +
                    ". Среда проживания: " + getLivingEnvironment()+
                    ". Скорость перемещения: " + getSpeedMove() +
                    " метров в секунду. Тип пищи: " + getFoodType();
        }
        @Override
        public void toEat() {
              System.out.println("Трава");
        }
        @Override
        public void sleep() {
              System.out.println("В стойле или в открытом поле");
        }
        @Override
        public void moveAround() {
              System.out.println("На копытах");
        }
        @Override
        public void walk() {
              System.out.println("На свободе");
        }
        public void graze(){     // метод для травоядных
              System.out.println("На пастбищах");
        }
    }