package edu.austral.ingsis.math;

import java.util.List;

public interface Function {
    public double evaluate();
    public String print();
    public List<String> listVariables(List<String> list);
}
