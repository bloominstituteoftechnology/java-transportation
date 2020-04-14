package transport;

import java.util.ArrayList;
import java.util.List;

/**
 * The main class controlling this application.
 */
public class Main
{
    /**
     * A field to hold the filtered list
     */
    public static List<AbstractVehicle> filteredList = new ArrayList<>();

    /**
     * A private method that is used to filter a list. The filtered list gets put into the filteredList field
     *
     * @param vehicles A List of AbstractVehicle to filter
     * @param tester   a lambda expression that is the filter we want to apply to the list
     * @param printit  boolean should the filtered list be displayed as well
     */
    public static void filterVehicles(List<AbstractVehicle> vehicles, CheckVehicle tester, boolean printit)
    {
        // start with a fresh filteredList
        filteredList.clear();

        for (AbstractVehicle v : vehicles)
        {
            if (tester.test(v))
            {
                if (printit)
                {
                    System.out.println(v.getName() + " " + v.getFuelLevel());
                }
                filteredList.add(v);
            }
        }
    }

    /**
     * The main method that runs this application
     *
     * @param args Not used in this application but required for the main method. This is where command line arguments would go.
     */
    public static void main(String[] args)
    {
        // ********************************
        // ********** Interfaces **********
        // ********************************
        System.out.println("*** Working with Interfaces ***");

        Horse seabiscuit = new Horse("Seabiscuit");
        Horse affirmed = new Horse("Affirmed");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        affirmed.eat(25);
        for (int i = 0; i < 3; i++)
        {
            seabiscuit.move();
        }
        System.out.println("Seabiscuit " + seabiscuit.getFuelLevel());


        // ********************************
        // ******* Abstract Classes *******
        // ********************************

        System.out.println("\n\n\n*** From Abstract Class ***");

        HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
        secretariat.addFuel(10);
        System.out.println("Secretariat " + secretariat.getFuelLevel());

        HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
        eclipse.move(10);
        System.out.println("Eclipse " + eclipse.getFuelLevel());

        HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
        HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
        HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);

        Auto vw = new Auto(1, "EuroVan", 2000);
        Auto toyota = new Auto(10, "Tundra", 1998);
        Auto honda = new Auto (5, "Accord", 2003);
        vw.move();
        vw.move(5);

        List<AbstractVehicle> myList = new ArrayList<>();
        myList.add(secretariat);
        myList.add(trigger);
        myList.add(seattleSlew);
        myList.add(americanPharoah);
        myList.add(eclipse);
        myList.add(vw);
        myList.add(toyota);
        myList.add(honda);

        System.out.println();
        System.out.println("*** This List ***");
        System.out.println(myList.toString());

        System.out.println("\n\n\n*** Working with Lambda Expressions ***");
        System.out.println("\n*** This List Sorted ***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v.getName()));

        // filter list
        // getFuelLevel() < 0
        System.out.println("\n*** This List Negative Fuel ***");
        filterVehicles(myList, v -> v.getFuelLevel() < 0, true);

        System.out.println("\n*** Horse with positive Fuel Sorted by Name ***");
        filterVehicles(myList, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle), false);
        filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        filteredList.forEach((v) -> System.out.println(v));
    }
}
