

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
{
        double n=8.5;
        double m=11.45;
        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);  
        if (b==c){
            System.out.println("Числа "+n +" и "+m + " равноудалены от "+a);
        }
        if(b>c){
            System.out.println("Число "+m+" ближе к "+a);
        }
        if (b<c) {
            System.out.println("Число "+n+" ближе к "+a);
        }
    }

}