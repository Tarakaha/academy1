package homework8;

class Mammal extends Animal {
    public Mammal(String name, double weight, double foodConsumptionPerDay, FoodType foodType) {
        super(name, weight, foodConsumptionPerDay, foodType);
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " спит");
    }
}
