package transport;

import java.util.ArrayList;
import java.util.Comparator;

public class Main
{
        public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester)
    {
        for (AbstractVehicle v : vehicles)
        {
            if (tester.test(v))
            {
                System.out.println(v.getName() + " " + v.getFuelLevel());
            }
        }
    }

    public static void main(String[] args)
    {
        // Part 1 Interfaces

        Horse seabiscuit = new Horse("Seabiscuit");
        Horse affirmed = new Horse("Affirmed");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        affirmed.eat(25);
        seabiscuit.move();
        seabiscuit.move();
        seabiscuit.move();
        System.out.println("Seabiscuit's fuel level " + seabiscuit.getFuelLevel());
        System.out.println();


        // Part 2 Abstract Classes

        System.out.println("*** From Abstract Class");
        HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
        secretariat.addFuel(10);
        System.out.println("Secretariat's fuel level " + secretariat.getFuelLevel());
        HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
        HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
        HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);
        HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
        eclipse.move(10);
        System.out.println("Eclipse's fuel leve " + eclipse.getFuelLevel());


        Auto vw = new Auto(1, "EuroVan", 2000);
        Auto toyota = new Auto(10, "Tundra", 1998);
        Auto honda = new Auto (5, "Accord", 2003);
        vw.move();
        vw.move(5);
        System.out.println(vw.model + " fuel level " + vw.getFuelLevel());


        // Part 3 Combining classes

        ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
        // myList.add((seabiscuit);
        myList.add(secretariat);
        myList.add(trigger);
        myList.add(seattleSlew);
        myList.add(americanPharoah);
        myList.add(eclipse);
        myList.add(vw);
        myList.add(toyota);
        myList.add(honda);

        System.out.println();
        System.out.println("*** The List ***");
        System.out.println(myList.toString());
        System.out.println();


        // Part 4 Lambda Expressions

        System.out.println("Vehicles with Negative Fuel");
        printVehicles(myList, v -> v.getFuelLevel() < 0);
        System.out.println();

        System.out.println("Horses with Postive Fuel");
        printVehicles(myList, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle));
        System.out.println();

        System.out.println("*** The List Another Way");
        myList.forEach((v) -> System.out.println(v));
        System.out.println();
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println();
        myList.forEach((v) -> System.out.println(v.getName()));
    }
}
