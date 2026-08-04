//StringIsPalindromOrNot
//Difficulty - easy
//DSA - Leetcode
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        // Loop to check if the string is a palindrome
        while (left < right) {
            // Skip non-alphanumeric characters on the left side
            if (!Character.isLetterOrDigit(s.charAt(left))) 
                left++;
            // Skip non-alphanumeric characters on the right side
            else if (!Character.isLetterOrDigit(s.charAt(right))) 
                right--;
            // If characters are different, it's not a palindrome
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) 
                return false;
            else {
                // Move towards the middle if characters are the same
                left++; 
                right--;
            }
        }
        return true;
    }
}
