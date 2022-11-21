package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.Value;

public class Absolute implements Operation{

    @Override
    public Function operate(Function v1, Function v2) {
        return new Value(Math.abs(v1.evaluate()));
    }

    @Override
    public String print() {
        return "abs";
    }
}
