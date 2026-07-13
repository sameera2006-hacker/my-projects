// pattern problem in java
// strivers a2z dsa sheet
//difficulty - easy
class Solution {
    public void pattern5(int n) {
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
