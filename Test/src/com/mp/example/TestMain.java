package com.mp.example;

public class TestMain
{
    public static void main(String[] args) 
    {
        String s="Today is the happiest day of my life";
        String[] word=s.split(" ");
        String rts=" ";
        for(int i=0;i<word.length;i++){
            for(int j=1+i;j<word.length;j++){
                if(word[i].length()>=word[j].length()){
                    rts=word[i];
                }
            }
        }
        System.out.println(rts);
        System.out.println(rts.length());
    }
}