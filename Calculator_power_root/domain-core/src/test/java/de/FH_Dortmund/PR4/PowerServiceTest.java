package de.FH_Dortmund.PR4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for PowerService
 * Testing if power is correctly working
 * Case "null" not tested due to not being able to initialize a double with null
 */
class PowerServiceTest {

    // Creating PowerService instance
    PowerService cut;

    /**
     * Initialize a new instance of PowerService before every test
     */
    @BeforeEach
    void init() {
        cut = new PowerService();
    }

    /**
     * Stream method to provide input for the parameterized test
     * @return Stream.of(Arguments.of(double,double,double))
     */
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(2,0,4),
                Arguments.of(10,0,100)
        );
    }

    /**
     * Parameterized test runs as often as @MethodSource provides arguments
     * Each test is a new instance and is named with name attribute of @ParameterizedTest
     */
    @ParameterizedTest(name = "{index}: when_calling_power_with_{0}_result_is_{2}")
    @MethodSource("provideParameters")
    void from_gives_correct_value(double firstNumber, double secondNumber, double givenResult) {

        // Arrange
        double number = firstNumber;

        // Act
        double result = cut.power(number,secondNumber);

        // Assert
        assertEquals(givenResult,result);
    }
}