package edu.austral.ingsis.math.Visitor.Operations;

import edu.austral.ingsis.math.Visitor.Variable;
import edu.austral.ingsis.math.Visitor.Visitable;
import edu.austral.ingsis.math.Visitor.Visitor;

public class Parentesis extends SingleVariableOperation implements Visitable {


    public Parentesis(Visitable variable) {
        super(variable);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
