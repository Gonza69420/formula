package edu.austral.ingsis.math.Visitor.Operations;

import edu.austral.ingsis.math.Visitor.Variable;
import edu.austral.ingsis.math.Visitor.Visitable;
import edu.austral.ingsis.math.Visitor.Visitor;

public class SingleVariableOperation {

    private Visitable variable;

    public SingleVariableOperation(Visitable variable) {
        this.variable = variable;
    }

    public Visitable getVariable() {
        return variable;
    }
}