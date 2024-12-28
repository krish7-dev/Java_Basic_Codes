package Strings;

import java.lang.StringBuilder;

public class Stringbuilder {
    public static void main(String args[]){
        String s0 = new String();
        StringBuilder s1= new StringBuilder();
        StringBuffer s2 = new StringBuffer();

        for(int i=0;i<10;i++){
            s0=s0+i;
        }

        for(int i=0;i<10;i++){
            s1=s1.append(i);
        }

        for(int i=0;i<10;i++){
            s2.append(i);
        }
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
    }
}
