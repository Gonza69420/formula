package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.Value;
import edu.austral.ingsis.math.Variable;

public class Sum implements Operation {
    @Override
    public Function operate(Function v1, Function v2) {
        return new Value(v1.evaluate()+v2.evaluate());
    }

    @Override
    public String print() {
        return "+";
    }
}
