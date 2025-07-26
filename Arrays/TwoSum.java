import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target){

        //Creating a hashmap
        HashMap<Integer, Integer> map=new HashMap<>();

        for (int i=0; i<nums.length;i++){ 
            //finding complement
            int difference=target-nums[i];


            //checking if map has the difference
            if (map.containsKey(difference)){
                //if yes, return the index
                return new int[]{map.get(difference),i};
            }

            map.put(nums[i],i);  //if not, put it in the map
        }
        return new int[]{};  //return empty array if there's no solution
    }
    
}



