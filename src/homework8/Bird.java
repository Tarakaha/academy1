package homework8;

class Bird extends Animal {
    public Bird(String name, double weight, double foodConsumptionPerDay, FoodType foodType) {
        super(name, weight, foodConsumptionPerDay, foodType);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }
}
