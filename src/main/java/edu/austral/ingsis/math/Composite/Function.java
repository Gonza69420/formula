package edu.austral.ingsis.math.Composite;

import java.util.List;

public interface Function {
     double evaluate();
     String print();
     List<String> listVariables(List<String> list);
}
