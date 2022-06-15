// Q1. let us assume a string “ALPHABETS” find the count of each character and find the length of “B” and replace as “Z” and print it.


import java.util.*;
public class Main
{
    static final int MAX_CHAR = 256;
 
    static void getOccuringChar(String str)
    {
        int count[] = new int[MAX_CHAR];
 
        int len = str.length();
 
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println("Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]);
        }
    }
   
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    int len = 0;
        char c = 'Z';
        int n = str.length();
        
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='B'){
           str = str.substring(0, i) + c + str.substring(i + 1);
           len++;
            }
        }
 
        System.out.println(str);
        System.out.println("length of B is " +len);
        getOccuringChar(str);
    }
}
