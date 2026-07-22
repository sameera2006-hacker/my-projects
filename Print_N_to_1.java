//print n to 1numbers-recurrsion
//diffficulty- easy
//DSA- take u forward using java
class Solution {
    public void printNumbers(int n) {
        print(n, n);
    }
    public void print(int n, int cnt){
        if(cnt == 0) return;
        System.out.println(cnt);
        print(n, cnt - 1);
    }
}
