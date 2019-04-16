package transport;

public abstract class AbstractVehicle
{
    int fuel;

    public AbstractVehicle(int fuel)
    {
        this.fuel = fuel;
    }

    public AbstractVehicle()
    {
        fuel = 1;
    }

    public abstract String getPath();
    public abstract String getName();

    public void move()
    {
        fuel--;
    };

    public void move(int steps)
    {
        fuel = fuel - steps;
    }

    public int getFuelLevel()
    {
        return fuel;
    };

    public void addFuel(int i)
    {
        fuel++;
    }
}
