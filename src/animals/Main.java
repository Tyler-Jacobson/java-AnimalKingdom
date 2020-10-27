package animals;

import java.util.List;
import java.util.ArrayList;

public class Main {

    // private static List<AbstractAnimal> filterVehicle(List<AbstractAnimal> vehicles, CheckVehicle tester) {
    //     List<AbstractAnimal> tempList = new ArrayList<>();

    //     for(AbstractAnimal v : vehicles) {
    //         if (tester.test(v)) {
    //             tempList.add(v);
    //         }
    //     }

    //     return tempList;
    // }

    private static List<AbstractAnimal> filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester) {
        List<AbstractAnimal> tempList = new ArrayList<>();

        for (AbstractAnimal a : animals) {
            if (tester.test(a)){
                tempList.add(a);
            }
        }

        return tempList;
    }

    public static void main(String[] args) {

        Mammal panda = new Mammal(0, "Panda", 1869);
        Mammal zebra = new Mammal(1, "Zebra", 1778);
        Mammal koala = new Mammal(2, "Koala", 1816);
        Mammal sloth = new Mammal(3, "Sloth", 1804);
        Mammal armadillo = new Mammal(4, "Armadillo", 1758);
        Mammal raccoon = new Mammal(5, "Raccoon", 1758);
        Mammal bigfoot = new Mammal(6, "Bigfoot", 2021);

        // System.out.println(panda);

        Bird pigeon = new Bird(7, "Pigeon", 1837);
        Bird peacock = new Bird(8, "Peacock", 1821);
        Bird toucan = new Bird(9, "Toucan", 1758);
        Bird parrot = new Bird(10, "Parrot", 1824);
        Bird swan = new Bird(11, "Swan", 1758);

        // System.out.println(pigeon);

        Fish salmon = new Fish(12, "Salmon", 1758);
        Fish catfish = new Fish(13, "Catfish", 1817);
        Fish perch = new Fish(14, "Perch", 1758);

        // System.out.println(salmon);

        // Printing the list /vs/ using a for loop and printing each item

        List<AbstractAnimal> myList = new ArrayList<>();

        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);

        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);

        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);
        
        System.out.println("\n*** List all the animals in descending order by year named ***");
        myList.sort((a1, a2) -> a2.getYear() - (a1.getYear()));
        myList.forEach((a) -> System.out.println(a));

        System.out.println("\n*** List all the animals alphabetically ***");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach((a) -> System.out.println(a));

        System.out.println("\n*** List all the animals order by how they move ***");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myList.forEach((a) -> System.out.println(a));


        // List<AbstractAnimal> filteredList = filterAnimal(myList, a -> a.getYear() > 1800);
        // filteredList.sort((a1, a2) ->  a2.getYear() - a1.getYear());
        // filteredList.forEach((a) -> System.out.println(a));


        System.out.println("\n*** List only those animals the breathe with lungs ***");
        List<AbstractAnimal> filteredList = filterAnimal(myList, a -> a.breathe() == "lungs");
        filteredList.forEach((a) -> System.out.println(a));

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        filteredList = filterAnimal(myList, a -> (a.breathe() == "lungs") && (a.getYear() == 1758));
        filteredList.forEach((a) -> System.out.println(a));

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        filteredList = filterAnimal(myList, a -> (a.breathe() == "lungs") && (a.reproduce() == "eggs"));
        filteredList.forEach((a) -> System.out.println(a));

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        filteredList = filterAnimal(myList, a -> (a.getYear() == 1758));
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach((a) -> System.out.println(a));
    }
}