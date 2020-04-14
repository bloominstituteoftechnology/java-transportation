package transport;

/**
 * Interface for what a vehicle must do.
 * Normally Javadocs are put on the interface and not its implementation.
 * The implementation just contains Javadocs for anything new.
 */
public interface Vehicle
{
    /**
     * Gets the path where the vehicle operates
     *
     * @return the path (String) where the vehicle operates
     */
    String getPath();

    /**
     *
     */
    void move();

    /**
     * Gets the fuel level for this vehicle
     *
     * @return the fuel level (int)
     */
    int getFuelLevel();

    /**
     * Add the given number of fuel units to the fuel level
     *
     * @param i the number of fuel units (int) to add to the fuel level
     */
    void addFuel(int i);
}