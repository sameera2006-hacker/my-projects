//count all digits of a number - strivers a2z
//difficulty - easy
//using math in java
class Solution {
    public int countDigit(int n) {
        int length = 0;
        while(n > 0){
            length++;
            n = n/10;
         }
         return length;

    }
}
