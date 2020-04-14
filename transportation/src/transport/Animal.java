package transport;

/**
 * Interface for what an animal must do.
 * Normally Javadocs are put on the interface and not its implementation.
 * The implementation just contains Javadocs for anything new.
 */
public interface Animal
{
    /**
     * An animal must be able to move
     */
    void move();

    /**
     * An animal must be able to eat a certain amount of units of something
     *
     * @param i the amount (int) of some units of something that the animal eats
     */
    void eat(int i);

    /**
     * An animal must be able to speak
     *
     * @return The sound (String) the animal speaks
     */
    String speak();
}