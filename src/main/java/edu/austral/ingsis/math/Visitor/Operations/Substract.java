package edu.austral.ingsis.math.Visitor.Operations;

import edu.austral.ingsis.math.Composite.Function;
import edu.austral.ingsis.math.Visitor.Visitable;
import edu.austral.ingsis.math.Visitor.Visitor;

import java.util.List;

public class Substract extends TwoVariableOperation{

    public Substract(Visitable visitable1, Visitable visitable2) {
        super(visitable1, visitable2);
    }


    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}

