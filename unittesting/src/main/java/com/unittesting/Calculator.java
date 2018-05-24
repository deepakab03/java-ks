package com.unittesting;

import java.util.Stack;

import org.springframework.util.Assert;

public class Calculator {

    private Stack<Integer> memStack;
    private String name;
    
    public Calculator() {
    }
    
    public void init() {
        Assert.notNull(memStack, "Mem stack must be provided");
    }
    
    public int add(final int num1, final int num2) {
        return num1 + num2;
    }
    
    public int sub(final int num1, final int num2) {
        return num1 - num2;
    }

    public void setMemStack(Stack<Integer> memStack) {
        this.memStack = memStack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + "_calculator";
    }

}
