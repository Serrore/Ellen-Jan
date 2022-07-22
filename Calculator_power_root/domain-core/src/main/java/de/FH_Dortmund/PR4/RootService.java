package de.FH_Dortmund.PR4;

import org.springframework.stereotype.Service;

/**
 * Service class from springframework to implement business logic of Root
 */
@Service
public class RootService implements Root {

    /**
     * Implementation of business logic to calculate the square root of a given number
     * @param firstNumber  Double used for calculations
     * @param secondNumber Placeholder to prevent errors while using JSON with only one argument
     * @return Returns the square root of firstNumber
     */
    @Override
    public double root(double firstNumber, double secondNumber){
        return Math.sqrt(firstNumber);
    }
}
