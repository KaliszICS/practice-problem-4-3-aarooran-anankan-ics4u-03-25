/**
 * Creates a rectangle, with a length and width
 * @author Aarooran Anankan
 * @version 1.0
 */
class Rectangle {

    private double length;
    private double width;

    /**
     * Sets the parameters to that of the instance variables
     * @param length the rectangle's length
     * @param width the rectangle's width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Getter that gets the rectangle's length
     * @return
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Getter that gets the rectangle's width
     * @return
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Constructor that sets the rectangle to length 4 and width 8 when no parameters given
     */
    public Rectangle() {
        this.length = 4;
        this.width = 8;
    }

    /**
     * Constructor that sets the rectangle to the given length and a width of 8
     * @param newLength the length of the rectangle
     */
    public Rectangle(double newLength) {
        this.length = newLength;
        this.width = 8;
    }
}