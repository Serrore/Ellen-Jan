/**
 * Model class for this MVC pattern containing all necessary variables with their respective getter and setter
 */
public class Model {

    private double firstNumber,secondNumber,result;


    /**
     * Getter for firstNumber
     * @return double
     */
    public double getFirstNumber() { return firstNumber; }

    /**
     * Setter for firstNumber
     * @param firstNumber double
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * Getter for secondNumber
     * @return double
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Setter for secondNumber
     * @param secondNumber double
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * Getter for result
     * @return double
     */
    public double getResult() { return result; }

    /**
     * Setter for result
     * @param result double
     */
    public void setResult(double result) {
        this.result = result;
    }
}
