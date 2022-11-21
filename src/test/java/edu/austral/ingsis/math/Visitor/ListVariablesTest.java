package edu.austral.ingsis.math.Visitor;

import edu.austral.ingsis.math.Visitor.Operations.*;
import edu.austral.ingsis.math.Visitor.Visitors.ListVariablesVisitor;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;


public class ListVariablesTest {

    private Visitor<List<String>> listVariables = new ListVariablesVisitor();

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldListVariablesFunction1() {
        final List<String> result = listVariables.visit(new Sum(new Variable(1), new Variable(6)));

        assertThat(result, empty());
    }

    /**
     * Case 12 / div
     */
    @Test
    public void shouldListVariablesFunction2() {
        final List<String> result = listVariables.visit(new Division(new Variable(12), new Variable("div")));
        for (int i = 0; i < result.size() ; i++) {
            System.out.println(result.get(i));
        }
        assertThat(result, containsInAnyOrder("div"));
    }

    /**
     * Case (9 / x) * y
     */
    @Test
    public void shouldListVariablesFunction3() {
        final List<String> result = listVariables.visit(new Multiplication(new Division(new Variable(9), new Variable("x")), new Variable("y")));

        assertThat(result, containsInAnyOrder("x", "y"));
    }

    /**
     * Case (27 / a) ^ b
     */
    @Test
    public void shouldListVariablesFunction4() {
        final List<String> result = listVariables.visit(new Power(new Division(new Variable(27), new Variable("a")), new Variable("b")));

        assertThat(result, containsInAnyOrder("a", "b"));
    }

    /**
     * Case z ^ (1/2)
     */
    @Test
    public void shouldListVariablesFunction5() {
        final List<String> result = listVariables.visit(new Power(new Variable("z"), new Division(new Variable(1), new Variable(2))));

        assertThat(result, containsInAnyOrder("z"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction6() {
        final List<String> result = listVariables.visit(new Sum(new Absolute(new Variable("value")), new Variable(8)));

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction7() {
        final List<String> result = listVariables.visit(new Sum(new Absolute(new Variable("value")), new Variable(8)));

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldListVariablesFunction8() {
        final List<String> result = listVariables.visit(new Multiplication(new Sum(new Variable(5), new Variable("i")), new Variable(8)));

        assertThat(result, containsInAnyOrder("i"));
    }
}
