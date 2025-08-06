package TwoPointers;

//Input: s = "Was it a car or a cat I saw?"
//Output: true

class Solution {
    public static boolean isPalindrome(String s) {
        //setting the left and right pointers
        int left=0;
        int right=s.length()-1;

        while(left<right){
            //skipping the alphanumeric characters
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            //comparing the characters in lowercase
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            } 


            //move left forward and right inward
            left++;
            right--;
        }

        return true;

    }
}



