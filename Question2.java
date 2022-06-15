
Q2.let us assume two string array as a={apple,fruit,text,world} and b={text,sam,try,apple,blue} compare the both array and give the count of word same in both array.


import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        
        String str1[]=new String[]{"apple","fruit","text","world"};
        String str2[]=new String[]{"text","fruit","try","apple","blue"};


        int count=0;
        boolean flag=false;

        for(int i=0; i<str1.length; i++){
            for(int j=0; j<str2.length; j++){
                if(str1[i].equals(str2[j])){
                    flag=true;
                    count++;
                }
                
                
            }
        }
        System.out.print(count);
    }
}
