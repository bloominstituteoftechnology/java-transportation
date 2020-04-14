package transport;

/**
 * A Horse class. Extends the abstract class AbstractVehicle. So we get an inheritance diagram like
 * <p>
 * Object - AbstractVehicle - HorseFromVehicle
 */
public class HorseFromVehicle extends AbstractVehicle
{
    /**
     * field that is the name (String) of the horse
     */
    private String name;

    /**
     * Constructor to set the initial state for this horse
     *
     * @param name The name (String) of this horse
     * @param fuel units of fuel (int) that this horse starts with.
     */
    public HorseFromVehicle(String name, int fuel)
    {
        // set fuel level using the parent, super, class
        super(fuel);
        // now double that fuel level because we can!
        this.fuel *= 2;
        this.name = name;
    }

    /**
     * Constructor to set this initial state for this horse
     * Fuel will be set to 1 via the default constructor for the abstract class
     *
     * @param name the name (String) of this horse
     */
    public HorseFromVehicle(String name)
    {
        this.name = name;
    }

    /**
     * Gets the path where this vehicle operates.
     * Implementation of method from AbstractVehicle.
     *
     * @return The path (String) where this vehicle operates
     */
    @Override
    public String getPath()
    {
        return "Grass";
    }

    /**
     * Getter for Name. Note we do not need a getter for fuel as its function is handled in methods from the abstract class.
     *
     * @return The name (String) of this horse.
     */
    @Override
    public String getName()
    {
        return name;
    }

    /**
     * Prints the current state of the object.
     *
     * @return the current state of the object (String).
     */
    @Override
    public String toString()
    {
        return "HorseFromVehicle{" +
            "name='" + name + '\'' +
            ", fuel=" + fuel +
            '}';
    }
}
