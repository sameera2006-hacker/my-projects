// Factorial - Recursion
// Difficulty - Easy
// Take U forward - java
class Solution {
    public int factorial(int n) {
        if(n == 0) return 1;
       
        return n*factorial(n-1);

    }
}
