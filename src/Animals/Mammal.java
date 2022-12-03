package Animals;
public abstract class Mammal extends Animal{
    private int speedMove;// скорость перемещения
    private String foodType;//тип пищи

    public Mammal(String name, int age, String livingEnvironment, int speedMove,String foodType) {
        super(name, age, livingEnvironment);
        this.speedMove = speedMove >= 0 ? speedMove : 2;
        this.foodType = validOrDefault(foodType,"С удовольствием");
    }

    public abstract void toEat();
    public abstract void sleep();
    public abstract void moveAround();
    public abstract void walk(); // метод класса млекопитающие гулять

    public String getFoodType() {

        return foodType;
    }

    public void setFoodType(String foodType) {

        this.foodType = foodType;
    }

    public int getSpeedMove() {

        return speedMove;
    }

}