package leetCodePractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int n=11;
        int i=0;
        int size = 0;
        while(size<n){
            i++;
            if(i==1)size++;
            int count2 = i-i/2*2;
            int count3 = i-i/3*3;
            int count5 = i-i/5*5;
            if(count2==0 || count3==0 || count5==0)size++;

        }

        System.out.print(i);




        }
    }

