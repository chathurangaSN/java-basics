package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharactersInAString {

        public void findDuplicateChars(String str){

            Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
            char[] chrs = str.toCharArray();
            for(Character ch:chrs){
                if(dupMap.containsKey(ch)){
                    dupMap.put(ch, dupMap.get(ch)+1);
                } else {
                    dupMap.put(ch, 1);
                }
            }
            
            // No 01: Iterating over Map.entrySet() using For-Each loop :
            for (Map.Entry<Character,Integer> entry : dupMap.entrySet())
            if(entry.getValue() > 1)
                System.out.println(entry.getKey() + "---->\t" + entry.getValue());
                
            // No 02: Iterating over Map.keySet()  using For-Each loop :
            for(Character ch:dupMap.keySet()){
                if(dupMap.get(ch) > 1)
                    System.out.println(ch+"--->"+dupMap.get(ch));
                    
            // No 03: Iterating using iterators over Map.Entry<K, V>
                // ------code here-----------
            // No 04: Using forEach(action) method
                // ------code here-----------
            // No 05: Iterating over keys and searching for values (inefficient)
                // ------code here-----------
            }
        }

        public static void main(String a[]){
            FindDuplicateCharactersInAString fdcs = new FindDuplicateCharactersInAString();
            fdcs.findDuplicateChars("java-basics");

        }
    }

