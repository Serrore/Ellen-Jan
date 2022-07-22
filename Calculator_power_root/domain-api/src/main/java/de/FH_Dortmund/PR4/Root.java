package de.FH_Dortmund.PR4;

/**
 * Interface for business logic and rest-api, domain-core
 */
public interface Root {

    /**
     * Empty method for implementations
     * @param firstNumber Double used for calculations
     * @param secondNumber Placeholder to prevent errors while using JSON with only one argument
     * @return Not used here
     */
    double root(double firstNumber, double secondNumber);
}
