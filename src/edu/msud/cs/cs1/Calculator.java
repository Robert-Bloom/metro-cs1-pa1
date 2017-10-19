package edu.msud.cs.cs1;

public class Calculator {
    enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE,
        MODULO
    }

    // Contrary to the prototypical assignment, this version
    // will have to support:
    //   - both integers and decimals (doubles), by overloading
    //   - positive, negative, and zero values
    //   - modulo ONLY for integers
    //   - arbitrary white space between operands and operator, excluding new lines
    //   - parentheses for negative numbers
    //   - bonus: three operands w/ operator precedence
    Calculator(int left, int right, Operation oper) {}
    Calculator(String expression) { /* to parse */}

    public int result() { return 0; }
}
