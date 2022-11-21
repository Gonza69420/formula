package edu.austral.ingsis.math.Visitor.Visitors;

import edu.austral.ingsis.math.Visitor.Operations.*;
import edu.austral.ingsis.math.Visitor.Variable;
import edu.austral.ingsis.math.Visitor.Visitor;

public class PrintVisitor implements Visitor<String> {
    @Override
    public String visit(Absolute absolute) {
        return "|" + absolute.getVariable().accept(this) + "|";
    }

    @Override
    public String visit(Sum sum) {
        return sum.getVisitable1().accept(this) + " + " + sum.getVisitable2().accept(this) ;
    }

    @Override
    public String visit(Substract substract) {
        return substract.getVisitable1().accept(this) + " - " + substract.getVisitable2().accept(this);
    }

    @Override
    public String visit(Division division) {
        return division.getVisitable1().accept(this) + " / " + division.getVisitable2().accept(this);
    }

    @Override
    public String visit(Power power) {
        return power.getVisitable1().accept(this) + " ^ " + power.getVisitable2().accept(this);
    }

    @Override
    public String visit(Multiplication multiplication) {
        return  multiplication.getVisitable1().accept(this) + " * " + multiplication.getVisitable2().accept(this);
    }

    @Override
    public String visit(Variable variable) {
        return variable.print();
    }

    @Override
    public String visit(Parentesis parentesis) {
        return "(" + parentesis.getVariable().accept(this) + ")";
    }

}
