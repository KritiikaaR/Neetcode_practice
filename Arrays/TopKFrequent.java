/* 
Given an integer array nums and an integer k, 
return the k most frequent elements within the array.
You may return the output in any order.

Example 1:
Input: nums = [1,2,2,3,3,3], k = 2
Output: [2,3]
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //Creating the HashMap
        HashMap<Integer,Integer> map=new HashMap<>();

        //If map has the number, increase the count
        //Otherwise, set it to 1
        for (int n:nums){
            if (map.containsKey(n)){
                map.put(n,map.get(n)+1);
            } else{
                map.put(n,1);
            }
        }

        //Bucket sort for top frequent element
        List<Integer>[] buckets=new List[nums.length+1];

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            int number=entry.getKey();
            int frequency=entry.getValue();


        }


        
        

    }
}
