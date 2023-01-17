import com.stack.MakeValidBracket;
import com.stack.ValidBracketProblemUsingStack;

public class Main {
    public static void main(String[] args) {
//        ValidBracketProblemUsingStack bracketProblemUsingStack = new ValidBracketProblemUsingStack();
//        System.out.println("{}}{}{}"+bracketProblemUsingStack.isValidExpression("{}}{}{}"));
//        System.out.println("{{{"+ bracketProblemUsingStack.isValidExpression("{{["));
//        System.out.println("}])"+bracketProblemUsingStack.isValidExpression("}])"));
//        System.out.println("{}}{}{}{[]"+bracketProblemUsingStack.isValidExpression("{}}{}{}{[]"));
//        System.out.println("{}}{}{}{[]"+bracketProblemUsingStack.isValidExpression("[({}{}){}]"));
//        System.out.println("[]{}{}[]()"+bracketProblemUsingStack.isValidExpression("[]{}{}[]()"));
//        System.out.println("f[sadhajsd]f{sdfh}{@#$}f[djf]f(d)"+bracketProblemUsingStack.isValidExpression("f[sadhajsd]f{sdfh}{@#$}f[djf]f(d)"));
//
//        System.out.println("{}}{}{}  isValidExpressionBest"+bracketProblemUsingStack.isValidExpressionBest("{}}{}{}"));
//        System.out.println("{{{"+ bracketProblemUsingStack.isValidExpressionBest("{{["));
//        System.out.println("}])"+bracketProblemUsingStack.isValidExpressionBest("}])"));
//        System.out.println("{}}{}{}{[]"+bracketProblemUsingStack.isValidExpressionBest("{}}{}{}{[]"));
//        System.out.println("{}}{}{}{[]"+bracketProblemUsingStack.isValidExpressionBest("[({}{}){}]"));
//        System.out.println("[]{}{}[]()"+bracketProblemUsingStack.isValidExpressionBest("[]{}{}[]()"));
//        System.out.println("f[sadhajsd]f{sdfh}{@#$}f[djf]f(d)"+bracketProblemUsingStack.isValidExpressionBest("f[sadhajsd]f{sdfh}{@#$}f[djf]f(d)"));

        MakeValidBracket makeValidBracket = new MakeValidBracket();
        System.out.println("((abcd)vg : "+makeValidBracket.makeValidBracket("((abcd)vg") );
        System.out.println("((abcd((vg : "+makeValidBracket.makeValidBracket("((abcd((vg") );
        System.out.println("))abcd)vg : "+makeValidBracket.makeValidBracket("))abcd)vg") );
        System.out.println("(()ghj)hj) : "+makeValidBracket.makeValidBracket("(()ghj)hj)") );
    }
}
