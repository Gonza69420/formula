package edu.austral.ingsis.math.Visitor;

import edu.austral.ingsis.math.Visitor.Operations.*;

public interface Visitor<T> {

    T visit(Absolute absolute);

    T visit(Sum sum);

    T visit(Substract substract);

    T visit(Division division);

    T visit(Power power);

    T visit(Multiplication multiplication);

    T visit(Variable variable);

    T visit (Parentesis parentesis);
}
