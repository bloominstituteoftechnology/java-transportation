package transport;

/**
 * An abstract class that defines the behaviors and information that every vehicle should know!
 */
abstract class AbstractVehicle
{
    /**
     * The fuel (int) level of this vehicle
     */
    protected int fuel;

    /**
     * The default constructor that initializes fuel to a level of 1
     */
    public AbstractVehicle()
    {
        fuel = 1;
    }

    /**
     * Constructor that initializes fuel level based on the given fuel level
     *
     * @param fuel the beginning fuel (int) level for this object
     */
    public AbstractVehicle(int fuel)
    {
        this.fuel = fuel;
    }

    /**
     * Abstract class that gets the path for this vehicle
     *
     * @return The path (String) for this vehicle
     */
    abstract String getPath();

    /**
     * Abstract method that gets the name for this vehicle
     *
     * @return The name (String) for this vehicle
     */
    abstract String getName();

    /**
     * Have the vehicle move one level of fuel
     */
    void move()
    {
        fuel--;
    }

    /**
     * Have the vehicle move the given level of fuel
     *
     * @param steps the amount (int) to lower the fuel level
     */
    void move(int steps)
    {
        fuel = fuel - steps;
    }

    /**
     * Returns the fuel level of this vehicle
     *
     * @return the fuel level (int) of this vehicle
     */
    int getFuelLevel()
    {
        return fuel;
    }

    /**
     * Adds to the fuel level the given level of fuel
     *
     * @param i the amount (int) to raise the fuel level
     */
    void addFuel(int i)
    {
        fuel = fuel + i;
    }
}
