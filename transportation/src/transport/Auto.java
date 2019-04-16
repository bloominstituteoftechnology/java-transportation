package transport;

public class Auto extends AbstractVehicle
{
    public String model;
    public int year;

    public Auto(int fuel, String model, int year)
    {
        super(fuel);
        this.model = model;
        this.year = year;
    }

    @Override
    public String getPath()
    {
        return "Road";
    }

    @Override
    public String getName()
    {
        return model;
    }

    @Override
    public String toString()
    {
        return "Auto{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", fuel=" + fuel +
                '}';
    }
}
