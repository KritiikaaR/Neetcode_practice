class Solution{
    public boolean isAnagram(String s, String t){

        //if length is not equal, it is not anagram, so immediately return false.
        if (s.length()!= t.length()){
            return false;
        }

        //creating array of 26 characters
        int[] count = new int[26];

        //adding counts for s
        for (int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }

        //subtracting counts for t
        for (int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }

        //checking if the count is completely 0
        for (int i=0;i<26;i++){
            if (count[i]!=0){
                return false;
            }
        }
        return true;
}
}
