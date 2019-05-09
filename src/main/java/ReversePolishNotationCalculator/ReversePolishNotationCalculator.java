package ReversePolishNotationCalculator;

import java.util.ArrayList;
import java.util.List;

public class ReversePolishNotationCalculator {

    /*
    Reverse polish notation calculator

Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation)
should evaluate to 14.
For your convenience, the input is formatted such that a space is provided between every token.
Empty expression should evaluate to 0.
Valid operations are +, -, *, /.
You may assume that there won't be exceptional situations (like stack underflow or division by zero).
     */

    public double evaluate(String expr) {

        int tmp;

        double addToList, var1, var2, var1Var2;
        double res = 0d;

        String[] splittedStringInput = expr.split("\\s+");

        List<Double> result = new ArrayList<>();

        if (expr.isEmpty()) {
            try {
                tmp = Integer.parseInt(expr);
            } catch (Exception e) {
                if (expr == null || expr.isEmpty()) { // case 1a
                    return 0; //case 1a
                } else { //case 1a
                    throw e;
                }
            }
        }


        for (int i = 0; i < splittedStringInput.length; i++) {
            if (!splittedStringInput[i].equals("+") && !splittedStringInput[i].equals("-") &&
                    !splittedStringInput[i].equals("*") && !splittedStringInput[i].equals("/")) {
                addToList = Double.parseDouble(splittedStringInput[i]);
                result.add(addToList);
            }

            if (splittedStringInput[i].equals("+")) {
                var2 = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                var1 = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                var1Var2 = var1 + var2;
                result.add(var1Var2);
            } else if (splittedStringInput[i].equals("-")) {
                var2 = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                var1 = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                var1Var2 = var1 - var2;
                result.add(var1Var2);
            } else if (splittedStringInput[i].equals("*")) {
                var2 = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                var1 = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                var1Var2 = var1 * var2;
                result.add(var1Var2);
            } else if (splittedStringInput[i].equals("/")) {
                var2 = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                var1 = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                var1Var2 = var1 / var2;
                result.add(var1Var2);
            }

        }

        if (result.size() == 1) {
            res = result.get(0);
        }

        return res;
    }

}


// Another way:

/*
import java.util.Stack;

public class Calc {
  public double evaluate(String expr) {
    if ("".equals(expr)) {
      return 0;
    }
    Stack<Double> stack = new Stack<Double>();
    for (String s : expr.split("\\s")) {
      if ("+".equals(s)) {
        stack.push(stack.pop() + stack.pop());
      } else if ("-".equals(s)) {
        stack.push(-1 * (stack.pop() - stack.pop()));
      } else if ("*".equals(s)) {
        stack.push(stack.pop() * stack.pop());
      } else if ("/".equals(s)) {
        stack.push(1 / (stack.pop() / stack.pop()));
      } else {
        stack.push(Double.parseDouble(s));
      }
    }
    return stack.pop();
  }
}
 */