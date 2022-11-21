package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.Value;
import edu.austral.ingsis.math.Variable;

public interface Operation {
    public Function operate(Function v1, Function v2);
    public String print();
}
