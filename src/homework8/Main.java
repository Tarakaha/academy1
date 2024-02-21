package homework8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("WildLife Park", 11);

        Animal tiger = new Predator("Тигр", 200, 80, FoodType.MEAT);
        Animal bear = new Predator("Медведь", 200, 30, FoodType.MEAT);
        Animal capibara = new Herbivore("Капибара", 63, 5, FoodType.GRASS);
        Animal giraffe = new Herbivore("Жираф", 800, 30, FoodType.GRASS);
        Animal pig = new Omnivore("Свинья", 150, 3, FoodType.MIXED);
        Animal eagle = new BirdOfPrey("Орёл", 4, 0.25, FoodType.MEAT);
        Animal colibri = new HerbivorousBird("Колибри", 1, 0.05, FoodType.GRASS);
        Animal woodpecker = new HerbivorousBird("Дятел", 1, 0.05, FoodType.INSECTS);
        Animal lizard = new Lizard("Хамелион", 0.5, 0.02, FoodType.INSECTS);
        Animal snake = new Snake("Питон", 3, 5, FoodType.MEAT);
        Animal turtle = new Turtle("Черепаха", 10, 0.2, FoodType.GRASS);

        zoo.addAnimal(tiger);
        zoo.addAnimal(bear);
        zoo.addAnimal(capibara);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(pig);
        zoo.addAnimal(eagle);
        zoo.addAnimal(colibri);
        zoo.addAnimal(woodpecker);
        zoo.addAnimal(lizard);
        zoo.addAnimal(snake);
        zoo.addAnimal(turtle);

        System.out.println("\n**********************************");
        System.out.println("Потребление пищи всеми мясоядными животными: " + zoo.calculateFoodConsumption(FoodType.MEAT)+" кг.");
        System.out.println("Общий вес всех животных: " + zoo.calculateTotalWeight() + " кг.");
        System.out.println("Количество животных, питающихся травой: " + zoo.countAnimalsByFoodType(FoodType.GRASS));
        System.out.println("Количество животных, питающихся насекомыми: " + zoo.countAnimalsByFoodType(FoodType.INSECTS));
        System.out.println("Количество всеядных животных: " + zoo.countAnimalsByFoodType(FoodType.MIXED));
        System.out.println("Количество мясоедов: " + zoo.countAnimalsByFoodType(FoodType.MEAT));
        System.out.println("Количество млекопитающих животных: " + zoo.countAnimalsByType(Mammal.class));
        System.out.println("Количество рептилий: " + zoo.countAnimalsByType(Reptile.class));
        System.out.println("\n**********************************");

        zoo.makeAllAnimalsSleep();
        System.out.println("\n**********************************");

        List<Animal> sortByName = zoo.sortByName();

        System.out.println("Сортировка животных по названию: ");
        for (Animal animal : sortByName) {
            System.out.println(animal.getName());
        }

        System.out.println("\n**********************************");
        List<Animal> sortByType = zoo.sortByType();
        System.out.println("Сортировка животных по типу: ");
        for (Animal animal : sortByType) {
            System.out.println(animal.getName() +" - " + animal.getClass().getSuperclass().getSimpleName());
        }

        System.out.println("\n**********************************");
        List<Animal> sortByWeight = zoo.sortByWeight();
        System.out.println("Сортировка животных по весу: ");
        for (Animal animal : sortByWeight) {
            System.out.println(animal.getName() + " - " + animal.getWeight());
        }

        System.out.println("\n**********************************");
        List<Animal> foundAnimals1 = zoo.findAnimalsByFoodType(FoodType.INSECTS);
        System.out.println("Животные, которые едят насекомых: ");
        for (Animal animal : foundAnimals1) {
            System.out.println(animal.getName());
        }
        System.out.println("\n**********************************");
        List<Animal> foundAnimals2 = zoo.findAnimalsByFoodTypeAndConsumption(FoodType.MEAT, 10, 50);
        System.out.println("Животные, которые едят мясо и потребляют от 10 до 50 кг в день.: ");
        for (Animal animal : foundAnimals2) {
            System.out.println(animal.getName());
        }
        System.out.println("\n**********************************");

        List<Animal> foundAnimals3 = zoo.findAnimalsByFoodTypeAndConsumption(FoodType.MEAT, 0, 1);
        System.out.println("Животные, которые едят мясо и потребляют менее 1 кг в день.: ");
        for (Animal animal : foundAnimals3) {
            System.out.println(animal.getName());
        }
    }
}
