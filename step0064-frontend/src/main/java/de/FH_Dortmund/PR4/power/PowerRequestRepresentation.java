package de.FH_Dortmund.PR4.power;

import org.immutables.value.Value;

/**
 * Representation interface of a PowerRequest
 * Using Immutables @Value.Immutable to generate code of an immutable object
 * Generated methods and values are: variables, setters, equals, hashCode and more
 */
@Value.Immutable
public interface PowerRequestRepresentation {

  double getFirstNumber();

  double getSecondNumber();

}
