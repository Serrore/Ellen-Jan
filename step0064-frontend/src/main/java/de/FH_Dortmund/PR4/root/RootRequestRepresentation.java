package de.FH_Dortmund.PR4.root;

import org.immutables.value.Value;

/**
 * Representation interface of a RootRequest
 * Using Immutables @Value.Immutable to generate code of an immutable object
 * Generated methods and values are: variables, setters, equals, hashCode and more
 */
@Value.Immutable
public interface RootRequestRepresentation {

  double getFirstNumber();

  double getSecondNumber();

}
