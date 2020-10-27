package animals;

public class Fish extends AbstractAnimal {
    public Fish(int id, String name, int yearDiscovered) {
        this.id = id;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

        }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breathe() {
        return "gills";
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