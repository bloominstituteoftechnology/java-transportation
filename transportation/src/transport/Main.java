package transport;

import java.util.*;

public class Main
{
	public static ArrayList<AbstractVehicle> filteredList = new ArrayList<AbstractVehicle>();

	public static void filterVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester, boolean printit)
	{
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


	public static void main(String[] args)
	{
		// ********** Interface **********

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


		// ********** Abstract Class **********

		System.out.println("\n*** From Abstract Class ***");

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

        ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
        myList.add(secretariat);
        myList.add(trigger);
        myList.add(seattleSlew);
        myList.add(americanPharoah);
        myList.add(eclipse);
        myList.add(vw);
        myList.add(toyota);
        myList.add(honda);

        System.out.println();
        System.out.println("\n\n\n*** This List ***");
        System.out.println(myList.toString());

        System.out.println("\n*** This List Sorted ***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v.getName()));

        // filter list
        // getFuelLevel() < 0
        System.out.println("\n*** This List Negative Fuel ***");
        filterVehicles(myList, v -> v.getFuelLevel() < 0, true);

        System.out.println("\n*** Horse with postive Fuel Sorted by Name ***");
        filterVehicles(myList, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle), false);
        filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        filteredList.forEach((v) -> System.out.println(v));
	}
}








