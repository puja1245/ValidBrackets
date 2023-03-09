package com.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class MakeValidBracket {
    public String makeValidBracket(String input) {
        StringBuilder validString = new StringBuilder(input);
        String[] inputArray = input.split("");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < inputArray.length; i++) {
            String temp = inputArray[i];
            if (temp.equals("(")) {
                stack.push(i);
            } else if (temp.equals(")")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    validString.setCharAt(i, '*');
                }
            }
        }

        if (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                validString.setCharAt(stack.pop(), '*');
            }
        }
        System.out.println("changesgi");
        //jwdhwjhdjh


        return validString.toString().replace("*", "");

    }
}