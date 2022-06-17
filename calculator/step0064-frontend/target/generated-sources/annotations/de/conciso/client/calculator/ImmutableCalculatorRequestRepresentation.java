package de.conciso.client.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link CalculatorRequestRepresentation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCalculatorRequestRepresentation.builder()}.
 */
@Generated(from = "CalculatorRequestRepresentation", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableCalculatorRequestRepresentation
    implements CalculatorRequestRepresentation {
  private final double firstNumber;
  private final double secondNumber;
  private final char operator;

  private ImmutableCalculatorRequestRepresentation(double firstNumber, double secondNumber, char operator) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.operator = operator;
  }

  /**
   * @return The value of the {@code firstNumber} attribute
   */
  @Override
  public double getFirstNumber() {
    return firstNumber;
  }

  /**
   * @return The value of the {@code secondNumber} attribute
   */
  @Override
  public double getSecondNumber() {
    return secondNumber;
  }

  /**
   * @return The value of the {@code operator} attribute
   */
  @Override
  public char getOperator() {
    return operator;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CalculatorRequestRepresentation#getFirstNumber() firstNumber} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCalculatorRequestRepresentation withFirstNumber(double value) {
    if (Double.doubleToLongBits(this.firstNumber) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCalculatorRequestRepresentation(value, this.secondNumber, this.operator);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CalculatorRequestRepresentation#getSecondNumber() secondNumber} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for secondNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCalculatorRequestRepresentation withSecondNumber(double value) {
    if (Double.doubleToLongBits(this.secondNumber) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCalculatorRequestRepresentation(this.firstNumber, value, this.operator);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CalculatorRequestRepresentation#getOperator() operator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operator
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCalculatorRequestRepresentation withOperator(char value) {
    if (this.operator == value) return this;
    return new ImmutableCalculatorRequestRepresentation(this.firstNumber, this.secondNumber, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCalculatorRequestRepresentation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCalculatorRequestRepresentation
        && equalTo(0, (ImmutableCalculatorRequestRepresentation) another);
  }

  private boolean equalTo(int synthetic, ImmutableCalculatorRequestRepresentation another) {
    return Double.doubleToLongBits(firstNumber) == Double.doubleToLongBits(another.firstNumber)
        && Double.doubleToLongBits(secondNumber) == Double.doubleToLongBits(another.secondNumber)
        && operator == another.operator;
  }

  /**
   * Computes a hash code from attributes: {@code firstNumber}, {@code secondNumber}, {@code operator}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Double.hashCode(firstNumber);
    h += (h << 5) + Double.hashCode(secondNumber);
    h += (h << 5) + Character.hashCode(operator);
    return h;
  }

  /**
   * Prints the immutable value {@code CalculatorRequestRepresentation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CalculatorRequestRepresentation{"
        + "firstNumber=" + firstNumber
        + ", secondNumber=" + secondNumber
        + ", operator=" + operator
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link CalculatorRequestRepresentation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CalculatorRequestRepresentation instance
   */
  public static ImmutableCalculatorRequestRepresentation copyOf(CalculatorRequestRepresentation instance) {
    if (instance instanceof ImmutableCalculatorRequestRepresentation) {
      return (ImmutableCalculatorRequestRepresentation) instance;
    }
    return ImmutableCalculatorRequestRepresentation.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCalculatorRequestRepresentation ImmutableCalculatorRequestRepresentation}.
   * <pre>
   * ImmutableCalculatorRequestRepresentation.builder()
   *    .firstNumber(double) // required {@link CalculatorRequestRepresentation#getFirstNumber() firstNumber}
   *    .secondNumber(double) // required {@link CalculatorRequestRepresentation#getSecondNumber() secondNumber}
   *    .operator(char) // required {@link CalculatorRequestRepresentation#getOperator() operator}
   *    .build();
   * </pre>
   * @return A new ImmutableCalculatorRequestRepresentation builder
   */
  public static ImmutableCalculatorRequestRepresentation.Builder builder() {
    return new ImmutableCalculatorRequestRepresentation.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCalculatorRequestRepresentation ImmutableCalculatorRequestRepresentation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CalculatorRequestRepresentation", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_FIRST_NUMBER = 0x1L;
    private static final long INIT_BIT_SECOND_NUMBER = 0x2L;
    private static final long INIT_BIT_OPERATOR = 0x4L;
    private long initBits = 0x7L;

    private double firstNumber;
    private double secondNumber;
    private char operator;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CalculatorRequestRepresentation} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CalculatorRequestRepresentation instance) {
      Objects.requireNonNull(instance, "instance");
      firstNumber(instance.getFirstNumber());
      secondNumber(instance.getSecondNumber());
      operator(instance.getOperator());
      return this;
    }

    /**
     * Initializes the value for the {@link CalculatorRequestRepresentation#getFirstNumber() firstNumber} attribute.
     * @param firstNumber The value for firstNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder firstNumber(double firstNumber) {
      this.firstNumber = firstNumber;
      initBits &= ~INIT_BIT_FIRST_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link CalculatorRequestRepresentation#getSecondNumber() secondNumber} attribute.
     * @param secondNumber The value for secondNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder secondNumber(double secondNumber) {
      this.secondNumber = secondNumber;
      initBits &= ~INIT_BIT_SECOND_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link CalculatorRequestRepresentation#getOperator() operator} attribute.
     * @param operator The value for operator 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder operator(char operator) {
      this.operator = operator;
      initBits &= ~INIT_BIT_OPERATOR;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCalculatorRequestRepresentation ImmutableCalculatorRequestRepresentation}.
     * @return An immutable instance of CalculatorRequestRepresentation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCalculatorRequestRepresentation build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCalculatorRequestRepresentation(firstNumber, secondNumber, operator);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_FIRST_NUMBER) != 0) attributes.add("firstNumber");
      if ((initBits & INIT_BIT_SECOND_NUMBER) != 0) attributes.add("secondNumber");
      if ((initBits & INIT_BIT_OPERATOR) != 0) attributes.add("operator");
      return "Cannot build CalculatorRequestRepresentation, some of required attributes are not set " + attributes;
    }
  }
}
