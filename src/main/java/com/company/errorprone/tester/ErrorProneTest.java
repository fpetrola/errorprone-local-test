package com.company.errorprone.tester;

public class ErrorProneTest {
    public static void main(String[] args) {
        infiniteRecursion(99);
    }

    static void infiniteRecursion(int x ){
        infiniteRecursion(x+1);
    }
}
