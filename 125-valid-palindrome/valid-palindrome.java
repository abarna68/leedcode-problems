class Solution {
    public boolean isPalindrome(String s) {
    s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    String reversed = new StringBuilder(s).reverse().toString();
    if(s.equals(reversed)){
        return true;
    }
    else{
        return false;
    }
    }
}