class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: Handle Edge Cases
        // Negative numbers are not palindromes (e.g., -121 reversed is 121-)
        // Numbers ending in 0 are not palindromes (e.g., 10 reversed is 01) 
        // ...unless the number is 0 itself.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int originalValue = x;
        long reversedNum = 0; // Use long to prevent integer overflow during calculation

        // Step 2: Reverse the number mathematically
        while (x > 0) {
            int lastDigit = x % 10;          // Get the last digit (e.g., 121 % 10 = 1)
            reversedNum = (reversedNum * 10) + lastDigit; // Shift left and add digit
            x = x / 10;                      // Remove the last digit (e.g., 121 / 10 = 12)
        }

        // Step 3: Compare original with reversed
        // If they are identical, it's a palindrome.
        return originalValue == (int)reversedNum;
    }
}