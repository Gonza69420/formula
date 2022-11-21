package edu.austral.ingsis.math.Visitor.Operations;

import edu.austral.ingsis.math.Composite.Function;
import edu.austral.ingsis.math.Visitor.Variable;
import edu.austral.ingsis.math.Visitor.Visitable;
import edu.austral.ingsis.math.Visitor.Visitor;

import java.util.List;

public class Absolute extends SingleVariableOperation {


    public Absolute(Visitable variable) {
        super(variable);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
