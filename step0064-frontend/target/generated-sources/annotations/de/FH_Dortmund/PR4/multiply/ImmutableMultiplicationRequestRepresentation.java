//-no-import-rewrite
package de.FH_Dortmund.PR4.multiply;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MultiplicationRequestRepresentation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMultiplicationRequestRepresentation.builder()}.
 */
@org.immutables.value.Generated(from = "MultiplicationRequestRepresentation", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableMultiplicationRequestRepresentation
    implements de.FH_Dortmund.PR4.multiply.MultiplicationRequestRepresentation {
  private final double firstNumber;
  private final double secondNumber;

  private ImmutableMultiplicationRequestRepresentation(double firstNumber, double secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
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
   * Copy the current immutable object by setting a value for the {@link MultiplicationRequestRepresentation#getFirstNumber() firstNumber} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMultiplicationRequestRepresentation withFirstNumber(double value) {
    if (Double.doubleToLongBits(this.firstNumber) == Double.doubleToLongBits(value)) return this;
    return new ImmutableMultiplicationRequestRepresentation(value, this.secondNumber);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MultiplicationRequestRepresentation#getSecondNumber() secondNumber} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for secondNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMultiplicationRequestRepresentation withSecondNumber(double value) {
    if (Double.doubleToLongBits(this.secondNumber) == Double.doubleToLongBits(value)) return this;
    return new ImmutableMultiplicationRequestRepresentation(this.firstNumber, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMultiplicationRequestRepresentation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMultiplicationRequestRepresentation
        && equalTo(0, (ImmutableMultiplicationRequestRepresentation) another);
  }

  private boolean equalTo(int synthetic, ImmutableMultiplicationRequestRepresentation another) {
    return Double.doubleToLongBits(firstNumber) == Double.doubleToLongBits(another.firstNumber)
        && Double.doubleToLongBits(secondNumber) == Double.doubleToLongBits(another.secondNumber);
  }

  /**
   * Computes a hash code from attributes: {@code firstNumber}, {@code secondNumber}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.lang.Double.hashCode(firstNumber);
    h += (h << 5) + java.lang.Double.hashCode(secondNumber);
    return h;
  }

  /**
   * Prints the immutable value {@code MultiplicationRequestRepresentation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "MultiplicationRequestRepresentation{"
        + "firstNumber=" + firstNumber
        + ", secondNumber=" + secondNumber
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link MultiplicationRequestRepresentation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MultiplicationRequestRepresentation instance
   */
  public static ImmutableMultiplicationRequestRepresentation copyOf(MultiplicationRequestRepresentation instance) {
    if (instance instanceof ImmutableMultiplicationRequestRepresentation) {
      return (ImmutableMultiplicationRequestRepresentation) instance;
    }
    return ImmutableMultiplicationRequestRepresentation.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMultiplicationRequestRepresentation ImmutableMultiplicationRequestRepresentation}.
   * <pre>
   * ImmutableMultiplicationRequestRepresentation.builder()
   *    .firstNumber(double) // required {@link MultiplicationRequestRepresentation#getFirstNumber() firstNumber}
   *    .secondNumber(double) // required {@link MultiplicationRequestRepresentation#getSecondNumber() secondNumber}
   *    .build();
   * </pre>
   * @return A new ImmutableMultiplicationRequestRepresentation builder
   */
  public static ImmutableMultiplicationRequestRepresentation.Builder builder() {
    return new ImmutableMultiplicationRequestRepresentation.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMultiplicationRequestRepresentation ImmutableMultiplicationRequestRepresentation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MultiplicationRequestRepresentation", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_FIRST_NUMBER = 0x1L;
    private static final long INIT_BIT_SECOND_NUMBER = 0x2L;
    private long initBits = 0x3L;

    private double firstNumber;
    private double secondNumber;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MultiplicationRequestRepresentation} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MultiplicationRequestRepresentation instance) {
      java.util.Objects.requireNonNull(instance, "instance");
      firstNumber(instance.getFirstNumber());
      secondNumber(instance.getSecondNumber());
      return this;
    }

    /**
     * Initializes the value for the {@link MultiplicationRequestRepresentation#getFirstNumber() firstNumber} attribute.
     * @param firstNumber The value for firstNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder firstNumber(double firstNumber) {
      this.firstNumber = firstNumber;
      initBits &= ~INIT_BIT_FIRST_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link MultiplicationRequestRepresentation#getSecondNumber() secondNumber} attribute.
     * @param secondNumber The value for secondNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder secondNumber(double secondNumber) {
      this.secondNumber = secondNumber;
      initBits &= ~INIT_BIT_SECOND_NUMBER;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMultiplicationRequestRepresentation ImmutableMultiplicationRequestRepresentation}.
     * @return An immutable instance of MultiplicationRequestRepresentation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMultiplicationRequestRepresentation build() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMultiplicationRequestRepresentation(firstNumber, secondNumber);
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if ((initBits & INIT_BIT_FIRST_NUMBER) != 0) attributes.add("firstNumber");
      if ((initBits & INIT_BIT_SECOND_NUMBER) != 0) attributes.add("secondNumber");
      return "Cannot build MultiplicationRequestRepresentation, some of required attributes are not set " + attributes;
    }
  }
}
