package pl.gov.coi.example;

public class CalculatorImpl implements Calculator {

    @Override
    public long sum(long a1, long a2) {
        return a1 + a2;
    }

    @Override
    public long difference(long a1, long a2) {
        return a1 - a2;
    }
}