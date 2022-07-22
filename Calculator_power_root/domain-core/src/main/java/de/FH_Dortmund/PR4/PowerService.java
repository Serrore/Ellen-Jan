package de.FH_Dortmund.PR4;

import org.springframework.stereotype.Service;

/**
 * Service class from springframework to implement business logic of Power
 */
@Service
public class PowerService implements Power{

    /**
     * Implementation of business logic to calculate the result of a given number to the power of two
     * @param firstNumber  Double used for calculations
     * @param secondNumber Placeholder to prevent errors while using JSON with only one argument
     * @return Returns firstNumber to the power of two
     */
    @Override
    public double power(double firstNumber, double secondNumber){
        return Math.pow(firstNumber,2);
    }
}
