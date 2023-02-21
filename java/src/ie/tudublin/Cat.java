package ie.tudublin;

public class Cat {

    private int numLives;

    public int getNumLives() {
        return numLives;
    }
    
    public Cat() {
        numLives = 9;
    }

    public void kill() {
        numLives--;
        if (numLives > 0) {
            System.out.println("Ouch");
        } else {
            System.out.println("Dead");
        }

    }

}
