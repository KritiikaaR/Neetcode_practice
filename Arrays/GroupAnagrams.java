/* 
Given an array of strings strs,group all anagrams together into sublists.
You may return the output in any order.

Example 1:
Input: strs = ["act","pots","tops","cat","stop","hat"]
Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
*/

import java.util.*;

class Solutionn {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //creating a hashmap first
        HashMap<String,List<String>> map = new HashMap<>();

        //for each string strs in the array
        for (String s:strs){

            //create an character array for each string s
            char[] arr=s.toCharArray();

            //Sorting the array so it gives alphabetical order
            Arrays.sort(arr);

            //join the sorted array into a new string 
            String key=new String(arr);

            //if map has the key, adds to it
            if (map.containsKey(key)){
                map.get(key).add(s);
            }else{  //else creates a new list and adds s
                List<String> newList=new ArrayList<>();
                newList.add(s);
                map.put(key, newList);
            }

        }
        return new ArrayList<>(map.values());
        
    }
}


