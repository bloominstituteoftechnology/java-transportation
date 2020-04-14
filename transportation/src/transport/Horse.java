package transport;

/**
 * A Horse class. Implements both interfaces Vehicle and Animal. So we get an inheritance diagram like
 * <p>
 * Object - Animal - Horse
 * Vehicle
 */
public class Horse implements Vehicle, Animal
{
    /**
     * field fuel level (int) initialized 0.
     */
    private int fuel = 0;

    /**
     * field Name (String) of horse.
     */
    private String name;

    /**
     * Constructor for Horse which sets the Horse's name.
     *
     * @param name the name (String) of the Horse.
     */
    public Horse(String name)
    {
        this.name = name;
    }

    /**
     * Getter for Name. Note we do not need a getter for fuel as its function is handled in methods from the interfaces.
     *
     * @return The name (String) of this horse.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Setter for Name. Note we do not need a setter for fuel as its function is handled in methods from the interfaces.
     *
     * @param name The new name (String) for this horse.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the path where this vehicle operates.
     * Implementation of method from Vehicle.
     *
     * @return The path (String) where this vehicle operates
     */
    @Override
    public String getPath()
    {
        return "Grass";
    }

    /**
     * Moves the Vehicle by reducing fuel level one unit.
     * Implementation of method from Vehicle, Animal. Notice move() is in both interfaces. We just need to implement once!
     */
    @Override
    public void move()
    {
        fuel = fuel - 1;
    }

    /**
     * Returns the fuel level of this Vehicle.
     * Implementation of method from Vehicle.
     *
     * @return the fuel level (String)
     */
    @Override
    public int getFuelLevel()
    {
        return fuel;
    }

    /**
     * Adds to fuel level the given number of unit.
     * Implementation of method from Vehicle.
     * eat() is from Animal and does the same thing as addFuel, so for a Horse we should just eat.
     *
     * @param i the number of fuel units (int) to add.
     */
    @Override
    public void addFuel(int i)
    {
        eat(i);
    }

    /**
     * Adds to fuel leve the given number of units.
     * Implementation of method from Animal.
     * @param i the amount (int) of some units of something that the animal eats.
     */
    @Override
    public void eat(int i)
    {
        fuel = fuel + i;
    }

    /**
     * Returns what this Horse speaks.
     * Implementation of method from Animal.
     *
     * @return What this Horse says (String).
     */
    @Override
    public String speak()
    {
        return "Neigh";
    }

    /**
     * Prints the current state of the object.
     *
     * @return the current state of the object (String).
     */
    @Override
    public String toString()
    {
        return "Horse{" +
            "fuel=" + fuel +
            ", name='" + name + '\'' +
            '}';
    }
}
