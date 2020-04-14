package transport;

/**
 * Class for Autos that inherits from AbstractVehicle.
 */
public class Auto extends AbstractVehicle
{
    /**
     * The type of auto (String). This will be considered the auto's "name".
     */
    private String model;

    /**
     * The model year (int) of this auto.
     */
    private int year;

    /**
     * Constructor for this Auto that sets the Auto's initial state.
     *
     * @param fuel  fuel (int) level of this Auto. Field Inherited from AbstractVehicle.
     * @param model "Name" (String) of this auto.
     * @param year  model year (int) of this auto.
     */
    public Auto(int fuel, String model, int year)
    {
        // call the constructor from the parent, super, class
        super(fuel);
        this.model = model;
        this.year = year;
    }

    /**
     * Gets the path where this abstract vehicle operates.
     * Implementation of method from AbstractVehicle.
     *
     * @return The path (String) where this abstract vehicle operates.
     */
    @Override
    public String getPath()
    {
        return "Road";
    }

    /**
     * Gets the name, model, of this abstract vehicle.
     * Implementation of method from AbstractVehicle.
     *
     * @return The name, model, of this abstract vehicle.
     */
    @Override
    public String getName()
    {
        return model;
    }

    /**
     * Getter for year. This field is unique to this class so we need a getter for it.
     *
     * @return The model year (int) of this Auto
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Setter for year. This field is unique to this class so we need a setter for it.
     *
     * @param year The new model year (int) of this Auto.
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     * Prints the current state of the object.
     *
     * @return the current state of the object (String).
     */
    @Override
    public String toString()
    {
        return "Auto{" +
            "year=" + year +
            ", fuel=" + fuel +
            '}';
    }
}