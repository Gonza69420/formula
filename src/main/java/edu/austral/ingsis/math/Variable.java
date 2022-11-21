package edu.austral.ingsis.math;

import java.util.List;

public class Variable implements Function{
    private String variable;

    public Variable(String variable) {
        this.variable = variable;
    }

    @Override
    public double evaluate() {
        return 0;
    }

    @Override
    public String print() {
        return variable;
    }

    @Override
    public List<String> listVariables(List<String> list) {
        return null;
    }
}
