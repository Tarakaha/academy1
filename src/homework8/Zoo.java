package homework8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Zoo {
    private int capacity;
    private List<Animal> animals;

    public Zoo(String nameZoo, int capacity) {
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (animals.size() < capacity) {
            animals.add(animal);
            System.out.println(animal.getName() + " заселился в зоопарк.");
        } else {
            System.out.println("Зоопарк полон, найдите другой.");
        }
    }

    public double calculateFoodConsumption(FoodType foodType) {
        return animals.stream()
                .filter(animal -> animal.getFoodType() == foodType)
                .mapToDouble(Animal::getFoodConsumptionPerDay)
                .sum();
    }

    public double calculateTotalWeight() {
        return animals.stream()
                .mapToDouble(Animal::getWeight)
                .sum();
    }

    public int countAnimalsByFoodType(FoodType foodType) {
        return (int) animals.stream()
                .filter(animal -> animal.getFoodType() == foodType)
                .count();
    }

    public int countAnimalsByType(Class<?> animalType) {
        return (int) animals.stream()
                .filter(animalType::isInstance)
                .count();
    }

    public void makeAllAnimalsSleep() {
        animals.forEach(Animal::sleep);
    }

    public List<Animal> sortByName() {


        return animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());
    }


    public List<Animal> sortByType() {

            return animals.stream()
                .sorted(Comparator.comparing(a -> {
                    if (a instanceof Mammal) {
                        return "Mammal";
                    } else if (a instanceof Bird) {
                        return "Bird";
                    } else if (a instanceof Reptile) {
                        return "Reptile";
                    }else {
                        return "Other";
                    }
                }))
                .collect(Collectors.toList());
    }



    public List<Animal> sortByWeight() {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::getWeight).reversed())
                .collect(Collectors.toList());
    }

    public List<Animal> findAnimalsByFoodTypeAndConsumption(FoodType foodType, double from, double to) {
        return animals.stream()
                .filter(animal -> animal.getFoodType() == foodType &&
                        animal.getFoodConsumptionPerDay() >= from &&
                        animal.getFoodConsumptionPerDay() <= to)
                .collect(Collectors.toList());
    }
    public List<Animal> findAnimalsByFoodType(FoodType foodType) {
        return animals.stream()
                .filter(animal -> animal.getFoodType() == foodType)
                .collect(Collectors.toList());
    }
}
