package edu.austral.ingsis.math.Visitor;

import edu.austral.ingsis.math.Operations.Operation;

public interface Visitor {
    public void visitOperation(Operation operation);
}
