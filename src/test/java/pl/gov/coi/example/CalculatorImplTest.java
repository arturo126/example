package pl.gov.coi.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorImplTest {
    private final Calculator calculator = new CalculatorImpl();

    @Test
    public void returnsParametersSum() {
        // Given
        long a1 = 10;
        long a2 = 20;

        // When
        long result = calculator.sum(a1, a2);

        // Then
        assertEquals(30, result);
    }

    @Test
    public void returnsParametersDifference() {
        // Given
        long a1 = 10;
        long a2 = 20;

        // When
        long result = calculator.difference(a1, a2);

        // Then
        assertEquals(-10, result);
    }
}