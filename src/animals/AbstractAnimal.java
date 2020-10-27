package animals;

abstract class AbstractAnimal {
    protected int id;
    protected String name;
    protected int yearDiscovered;

    public String eat() {
        return "eats some food";
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return yearDiscovered;
    }

    public int getId() {
        return id;
    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();


}