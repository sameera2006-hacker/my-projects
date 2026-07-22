//Take u forward - Recursion
//print 1 to N
//DSA using java
class Solution {
    public void printNumbers(int n) {
        count(1, n);
    }
    public void count(int cnt, int n){
        if(cnt  > n) return;
        System.out.println(cnt+ " " );
        count(cnt + 1, n);
    }
}
