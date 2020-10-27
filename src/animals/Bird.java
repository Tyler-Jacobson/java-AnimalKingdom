package animals;

public class Bird extends AbstractAnimal {
    public Bird(int id, String name, int yearDiscovered) {
        this.id = id;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

        }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return name + " " + reproduce() + " " + move() + " " + breathe() + " " + yearDiscovered;
    }
}