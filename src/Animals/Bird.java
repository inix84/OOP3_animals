package Animals;
public abstract class Bird extends Animal{
        String movementType; // Тип движения
        public Bird(String name, int age, String livingEnvironment, String movementType) {
            super(name, age, livingEnvironment);
            this.movementType =validOrDefault(movementType, "Летает или ходит");
        }
        public abstract void toEat();
        public abstract void sleep();
        public abstract void moveAround();
        public abstract void hunt(); //охотиться метод для птиц абстр
        public String getMovementType() {
            return movementType;
        }
        public void setMovementType(String movementType) {
            this.movementType = movementType;
        }
    }