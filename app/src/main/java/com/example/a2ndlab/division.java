package com.example.a2ndlab;

public class division extends MainActivity {
    public int d;
    public int r;
    public String text;
    public String div(int a,int b){
        d=a/b;
        r=a%b;
        text="Quotient is"+d+"remainder is"+r;
        return text;


    }
}
