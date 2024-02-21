package homework8;

abstract class Animal {
    protected String name;
    protected double weight;
    protected double foodConsumptionPerDay;
    protected FoodType foodType;

    public Animal(String name, double weight, double foodConsumptionPerDay, FoodType foodType) {
        this.name = name;
        this.weight = weight;
        this.foodConsumptionPerDay = foodConsumptionPerDay;
        this.foodType = foodType;

    }

    public double getWeight() {
        return weight;
    }

    public double getFoodConsumptionPerDay() {
        return foodConsumptionPerDay;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public String getName(){
        return name;
    }

    public abstract void sleep();
}
