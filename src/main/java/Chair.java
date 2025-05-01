/**
 * Creates a chair with a certain amount of legs and material
 * @author Aarooran Anankan
 * @version 1.0
 */
class Chair {
    
    private int legs;
    private String material;

    /**
     * Sets the parameters to that of the instance variables
     * @param legs the amount of legs on the chair
     * @param material the material of the chair
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * Getter that gets the amount of chair legs
     * @return
     */
    public int getLegs() {
        return this.legs;
    }

    /**
     * Getter that gets the chair material
     * @return
     */
    public String getMaterial() {
        return this.material;
    }

    /**
     * Constructor that sets the amount of chair legs to 4 and it's material to wood when there are no parameters present
     */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * Constructor that sets the amount of chair legs to the given parameter and the material to wood
     * @param newLegs the new amount of chair legs
     */
    public Chair(int newLegs) {
        this.legs = newLegs;
        this.material = "wood";
    }
}