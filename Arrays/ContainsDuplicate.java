import java.util.*;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>(); //creating a hashset 
        
        
        for (int n:nums){
            if (set.contains(n)){ //if any number is already present, terminate the program and return true
                return true;
            }
            set.add(n);  //otherwise add it to the set
        }

        return false;   //return false if no duplicate is found
    }
}