package com.example;

public class CodeInjection {

    public CodeInjection() {
        System.out.println("Code Injection Library Constructor called. Class name: " + CodeInjection.class.getName());
    }

    public String returnString() {
        return "The class "+ CodeInjection.class.getName() + " and it's method returnString was just called";
    }
}
