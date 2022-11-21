package edu.austral.ingsis.math.Composite.Operations;

import edu.austral.ingsis.math.Composite.Function;

public class Absolute extends SingleVariableOperation implements Function{

    public Absolute(Function function) {
        super(function);
    }

    @Override
    public double evaluate() {
        return Math.abs(getFunction().evaluate());
    }

    @Override
    public String print() {
        return "|"+getFunction().print()+"|";
    }

}
