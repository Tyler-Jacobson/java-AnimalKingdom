package animals;

public class Mammal extends AbstractAnimal {
    public Mammal(int id, String name, int yearDiscovered) {
        this.id = id;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

        }



    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String toString() {
        return name + " " + reproduce() + " " + move() + " " + breathe() + " " + yearDiscovered;
    }
}