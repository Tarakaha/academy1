package homework8;

class Reptile extends Animal {
    public Reptile(String name, double weight, double foodConsumptionPerDay, FoodType foodType) {
        super(name, weight, foodConsumptionPerDay, foodType);
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " спит.");
    }
}
