------------------------------------ Tower of Hanoi -----------------------------------------------------------
public class Recursion {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
//transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
//transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
//transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 1;
        towerOfHanoi(n, "A", "B", "C");
    }
}
// output ---> transfer disk 1 from A to C
-----------------------------------------------------------------------------------------------------------------
public class Recursion {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
//transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
//transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
//transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    }
}
// output ---> 
// transfer disk 1 from A to C
// transfer disk 2 from A to C
// transfer disk 1 from C to B
// transfer disk 3 from A to B
// transfer disk 1 from B to A
// transfer disk 2 from B to A
// transfer disk 1 from A to C
-----------------------------------------------------------------------------------------------------------------
// Print a string in reverse.
 public class Recursion {
    public static String revString(String str) {
        if(str.length() == 1) {
            return str;
        }
        char currChar = str.charAt(0);
        String nextString = revString(str.substring(1));
        return nextString + currChar;
    }
    public static void main(String [] args) {
        String str = "YS07";
        String reversed = revString(str);
        System.out.println(reversed);
    }
}
// output ---> 70SY
-----------------------------------------------------------------------------------------------------------------
// Print a string in reverse.
public class Recursion {
    public static void revString(String str, int idx) {
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        revString(str,idx-1);
    }
    public static void main(String [] args) {
        String str = "YS07";
        revString(str,str.length()-1);
    }
}
// output ---> 70SY
-----------------------------------------------------------------------------------------------------------------
// Find the occurrence of the first and last occurrence of an element using recursion.
public class Recursion {
    public static int first = -1;
    public static int last = 1;
    public static void findOccurrence(String str, char element, int idx) {
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurrence(str, element, idx+1);
    }
    public static void main(String[] args){
        String str = "tabcdfghijakkk";
        findOccurrence(str,'a', 0);
    }
}
// output ---> 1
//             10
-----------------------------------------------------------------------------------------------------------------
//  Check if an array is sorted (strictly increasing).
public class Recursion {
    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            // array is sorted till now
            return isSorted(arr, idx+1);
            }else {
               return false;
            }
        }

    public static void main(String[] args){
       int arr[] = {1,3,2};
        System.out.print(isSorted(arr,0));
    }
} 
// false
-----------------------------------------------------------------------------------------------------------------
//  Check if an array is sorted (strictly increasing).
public class Recursion {
    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            // array is sorted till now
            return isSorted(arr, idx+1);
            }else {
               return false;
            }
        }

    public static void main(String[] args){
       int arr[] = {1,2,3};
        System.out.print(isSorted(arr,0));
    }
} 
// output ---> true
-----------------------------------------------------------------------------------------------------------------
//  Move all ‘x’ to the end of the string.
public class Recursion {
    public static void moveAllX(String str, int idx, int count, String newString) {
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count ++;
            moveAllX(str, idx+1, count, newString);
        } else {
            newString += currChar; // newString = newString + currChar
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String args[]) {
        String str = "axbcxxd";
         moveAllX(str, 0, 0, "");
    }
}
// output ---> abcdxxx
-----------------------------------------------------------------------------------------------------------------
// Remove duplicates in a string.
public class Recursion {
    public static String removeDuplicates(String str, int idx, boolean present[]) {
        if (idx == str.length()) {
            return "";
        }
        char curr = str.charAt(idx);
        if (present[curr - 'a']) {
            return removeDuplicates(str, idx + 1, present);
        } else {
            present[curr - 'a'] = true;
            return curr + removeDuplicates(str, idx + 1, present);
        }
    }

    public static void main(String args[]) {
        String str = "abcadbcefghabi";
        boolean present[] = new boolean[str.length()];
        System.out.println(removeDuplicates(str, 0, present));
    }
}
// output ---> abcdefghi
-----------------------------------------------------------------------------------------------------------------
// Remove duplicates in a string.
public class Recursion {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicates(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abcadbcefghabi";
        removeDuplicates(str, 0, "");
    }
}
// output ---> abcdefghi
-----------------------------------------------------------------------------------------------------------------
// Print all the subsequences of a string
public class Recursion {
    public static void subsequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        subsequences(str, idx+1, newString+currChar);

        // or not to be
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
// output ---> 
// abc
// ab
// ac
// a
// bc
// b
// c

----------------------------------------------------------------------------------------------------------------- 
// Print all unique subsequences of a string
import java.util.HashSet;
public class Recursion {
    public static void subsequences(String str, int idx, String res, HashSet<String>
            allSubseq) {
        if(idx == str.length()) {
            if(allSubseq.contains(res)) {
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
//choose
        subsequences(str, idx+1, res+str.charAt(idx), allSubseq);
//don't choose
        subsequences(str, idx+1, res, allSubseq);
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aaa";
        HashSet<String> allSubseq = new HashSet<>();
        subsequences(str2, 0, "", allSubseq);
    }
}
// output ---> 
// aaa
// aa
// a

----------------------------------------------------------------------------------------------------------------- 
// Print keypad combination
1 -> abc
2 -> def
3 -> ghi
4 -> jkl
5 -> mno
6 -> pqrs
7 -> tu
8 -> vwx
9 -> yz
import java.util.HashSet;
public class Recursion {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz"};

    public static void printKeypadCombination(String number, int idx, String res) {
        if (idx == number.length()) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < keypad[number.charAt(idx) - '0'].length(); i++) {
            char curr = keypad[number.charAt(idx) - '0'].charAt(i);
            printKeypadCombination(number, idx + 1, res + curr);
        }
    }

    public static void main(String args[]) {
        String number = "23";
        printKeypadCombination(number, 0, "");
    }
}
// output --->
// dg
// dh
// di
// eg
// eh
// ei
// fg
// fh
// fi
----------------------------------------------------------------------------------------------------------------- 
