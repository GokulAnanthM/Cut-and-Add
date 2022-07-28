/*
Cut and Add:

Harry and Potter took a word string. Harry chose a number M (less than the length of the
string) and Potter chose N (less than the length of the string). Harry will cut M alphabets
from the end of the string and then add it to the beginning and will give it to Potter. Then,
Potter will also cut N alphabets from the end of the string, add it to the beginning and ther
give to Harry. This process will continue till they get the original word string back.

For a given string and given values of M and N, find the number of turns in which they wi
get the original word string back.

Input Specification:
input1: Original word string
input2: Value of M
input3: Vlaue of N

​output Specification:
No. of turns to get back the original word string

Sample Input:
input1: AbcDef
input2: 1
input3: 2

Sample Output:
4

Expanation:
1-fAbcDe // count=1 
2-DefAbc // count=2
3-cDefAb // count=3
4-AbcDef // count=4
Hence, Output is 4.
*/

import java.util.*;
import java.io.*;

class CutandAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // input1
        int a = sc.nextInt(); // input2
        int b = sc.nextInt(); // input3
        int count=0; // initially, count is 0
        String out; 
        String val = str; // copy the value of input1 to val
        for(int i=0; i<str.length(); i++){
            if(count%2==0){ // if count is even
                out = val.substring(val.length()-a, val.length()) + val.substring(0, val.length()-a);
                // concatenate the cut N alphabets from the end of the string, add it to the beginning using input2. 
            }
            else{ // if count is odd
                out = val.substring(val.length()-b, val.length()) + val.substring(0, val.length()-b);
                // concatenate the cut N alphabets from the end of the string, add it to the beginning using input3.
            }
            System.out.println(out); // print output
            val = out; // now the output string is copied to string val
            count++; // count has been incremented
            if(val.equals(str)){
                break; // if string val and the input1 string is equal break the loop
            } // else loop goes on upto the length of input1
        }
        System.out.println("\n");
        System.out.println(count); // print count
    }
}