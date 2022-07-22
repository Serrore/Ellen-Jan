package de.FH_Dortmund.PR4;

import lombok.Builder;
import lombok.Value;

/**
 * Representation class of a PowerResponse
 * Using lombok @Value to generate code of an immutable object
 * Generated methods are:  getters, equals, hashCode and more
 * Using lombok @Builder to use the Builder pattern by GoF
 * With @Builder an instance of this class is created
 */
@Value
@Builder
public class PowerResponseRepresentation {
    double result;
}
