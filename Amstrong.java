// Amstrong number - TUF 
// Difficulty - easy
// basic math using java
class Solution {
    public boolean isArmstrong(int n) {
        int x = (int) (Math.log10(n)+1);
        int original = n;
        int ams = 0;
        while(n > 0){
            int y = n % 10;
            ams = ams + (int) Math.pow(y, x);
            n = n/10;
        }
        return original == ams;
    }
}
