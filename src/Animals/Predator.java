package Animals;
public class Predator  extends Mammal{
        public Predator(String name, int age, String livingEnvironment, int speedMove, String foodType) {
            super(name, age, livingEnvironment, speedMove, foodType);
        }
        @Override
        public String toString() {
            return "Название хищника: "+ getName() +
                    ". Возраст: "+ getAge() +
                    " лет. Среда проживания: " +getLivingEnvironment()+
                    ". Скорость перемещения: " + getSpeedMove() +
                    " метров в секунду. Тип пищи: " + getFoodType();
        }
        @Override
        public void toEat() {
            System.out.println("Других животных");
        }
        @Override
        public void sleep() {
            System.out.println("В безопасном месте");
        }
        @Override
        public void moveAround() {
            System.out.println("на 4 лапах");
        }
        @Override
        public void walk() {
            System.out.println("Гуляют где хотят");
        }
        public void hunt() {
            System.out.println("Догоняют и съедают");
        }
    }