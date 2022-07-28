Cut-and-Add

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
input3: Value of N

output Specification:
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
