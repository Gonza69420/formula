package edu.austral.ingsis.math;

import java.util.List;

public class Value implements Function{
    private double value;

    public Value(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String print() {
        return String.valueOf(value);
    }

    @Override
    public List<String> listVariables(List<String> list) {
        return List.of();
    }
}
