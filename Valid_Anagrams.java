import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
       char[] arr = s.toCharArray();
       Arrays.sort(arr);
       char[] arr1= t.toCharArray();
       Arrays.sort(arr1);
       return Arrays.equals(arr,arr1);
    }
}
