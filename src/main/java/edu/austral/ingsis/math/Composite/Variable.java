package edu.austral.ingsis.math.Composite;

import edu.austral.ingsis.math.Composite.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Variable implements Function {
    private String variable;
    private int value;

    public Variable(String variable, int value) {
        this.variable = variable;
        this.value = value;
    }

    public Variable(int value) {
        this.value = value;
        this.variable="";
    }

    public Variable(String variable) {
        this.variable = variable;
        this.value = 0;
    }

    @Override
    public double evaluate() {
        return value;
    }

    public boolean isVariable () {
        return !variable.equals("");
    }

    @Override
    public String print() {
        if(!variable.equals("")){
            return variable;
        } else{
            return String.valueOf(value);
        }
    }

    @Override
    public List<String> listVariables(List<String> list) {
        if(variable.equals("")){
            return List.of();
        }
        List<String> names = new ArrayList<>();
        names.add(variable);
        return Stream.concat(list.stream(), names.stream()).collect(Collectors.toList());
    }
}
