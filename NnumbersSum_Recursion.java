//Nnumberssum - recursion
//Difficulty - Easy
//take u Forward - java
class Solution {
    public int NnumbersSum(int N) {
        if(N == 1) return 1;
        return N + NnumbersSum(N - 1);
    }    
}
