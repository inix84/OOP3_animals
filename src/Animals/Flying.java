package Animals;
public class Flying extends Bird{
           public Flying(String name, int age, String livingEnvironment, String movementType) {
            super(name, age, livingEnvironment, movementType);
        }
        @Override
        public String toString() {
            return "Название летающей птицы: " + getName() +
                    ". Возраст: " + getAge() +
                    " лет. Среда проживания: " + getLivingEnvironment() +
                    ". Тип перемещения: " + movementType;
        }
        public void toEat() {
               System.out.println("Насекомых, мелких животных, рыбок");
        }
        public void sleep() {
               System.out.println("Спит на дереве либо на скале");
        }
        public void moveAround() {
               System.out.println("Летает или ныряет");
        }
        public void hunt() {
               System.out.println("Охотятся");
        }
        public void fly() { // метод для летающих птиц
               System.out.println("Да, летают");
        }
    }