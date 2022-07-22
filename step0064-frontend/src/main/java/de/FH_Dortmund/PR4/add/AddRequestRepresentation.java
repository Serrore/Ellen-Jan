package de.FH_Dortmund.PR4.add;

import org.immutables.value.Value;

/**
 * Representation interface of a AddRequest
 * Using Immutables @Value.Immutable to generate code of an immutable object
 * Generated methods and values are: variables, setters, equals, hashCode and more
 */
@Value.Immutable
public interface AddRequestRepresentation {

  double getFirstNumber();

  double getSecondNumber();

}
