package edu.austral.ingsis.math.Composite.Operations;

import edu.austral.ingsis.math.Composite.Function;

public class Parentesis extends SingleVariableOperation implements Function {


    public Parentesis(Function function) {
        super(function);
    }

    @Override
    public double evaluate() {
        return getFunction().evaluate();
    }

    @Override
    public String print() {
        return "(" + getFunction().print() + ")";
    }

}
