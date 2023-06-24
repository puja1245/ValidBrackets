package com.stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidBracketProblemUsingStack {
    HashMap<Character,Character> brackets;
    public ValidBracketProblemUsingStack(){
        brackets = new HashMap<>();
        brackets.put('}','{');
        brackets.put(']','[');
        brackets.put(')','(');
    }

    public boolean  isValidExpression(String s) {

        if(s.equals("")){
            return true;
        }
        char[] inputArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i< inputArray.length ; i++){
            if(brackets.containsValue(inputArray[i])){
                stack.push(inputArray[i]);
            } else if (brackets.containsKey(inputArray[i])) {
                if(stack.size() != 0) {
                    Character popData = stack.pop();
                    if (popData != (brackets.get(inputArray[i]))){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return stack.size()==0 ;
    }

    public boolean isValidExpressionBest(String s) {
        //hi
        //wdkjkej
        if(s.equals("")){
            return true;
        }
        char[] inputArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i< inputArray.length ; i++){
            switch (inputArray[i]){
                case '{' :
                case '[' :
                case '(' :
                    stack.push(inputArray[i]);
                    break;
                case '}' :
                    if (stack.isEmpty() || !stack.pop().equals('{')) {
                        return  false;
                    }
                    break;
                case ']' :
                    if (stack.isEmpty() || !stack.pop().equals('[')) {
                        return  false;
                    }
                    break;
                case ')' :
                    if (stack.isEmpty() || !stack.pop().equals('(')) {
                        return  false;
                    }
                    break;
            }

        }
        return stack.size()==0 ;
    }


}
