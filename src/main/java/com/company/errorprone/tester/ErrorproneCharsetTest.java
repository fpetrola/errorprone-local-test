package com.company.errorprone.tester;






































public class ErrorproneCharsetTest {
    
    public static void main(String[] args) {

        byte[] firstString= "example string".getBytes();
        String result= new String(firstString);

        System.out.println(result);
    }
}
