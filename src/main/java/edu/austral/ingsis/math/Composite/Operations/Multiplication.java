package edu.austral.ingsis.math.Composite.Operations;

import edu.austral.ingsis.math.Composite.Function;
import edu.austral.ingsis.math.Composite.Variable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Multiplication extends TwoVariableOperation{


    public Multiplication(Function function1, Function function2) {
        super(function1, function2);
    }

    @Override
    public double evaluate() {
        return getFunction1().evaluate()*getFunction2().evaluate();
    }

    @Override
    public String print() {
        return getFunction1().print() + " * " + getFunction2().print();
    }

}
