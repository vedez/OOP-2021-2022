package ie.tudublin;

public class Dog extends Animal
{
    private int numLives;

    public void kill() {
        if (numLives > 0)
        {
            System.out.println("Bark!");
            numLives--;
        }
        else
        {
            System.out.println("Woof, dead!");
        }
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public Dog(String name)
    {
        super(name);
        numLives = 2;
    }
}