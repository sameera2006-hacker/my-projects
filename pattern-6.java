class Solution {
    public void pattern6(int n) {
        for(int i=n-1; i>=0; i--){
            for(int j = 1; j<=i+1; j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
