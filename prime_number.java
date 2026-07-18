// Prime number - TUF
// Difficulty - easy
// basic math using java
class Solution {
    public boolean isPrime(int n) {
        int cnt  = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                cnt++;
            }
            if(cnt > 2) return false;
        }
        return true;
    }
}
