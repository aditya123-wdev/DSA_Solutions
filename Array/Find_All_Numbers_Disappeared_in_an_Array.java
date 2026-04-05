import java.util.*;
class Solution {
    public List<Integer> missingNum(int[] nums){
        List<Integer> result = new ArrayList<>();
        int n=nums.length;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[nums[i]-1] = nums[i];
        }
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                result.add(j+1);
            }
        }
        return result;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return missingNum(nums);
    }
}
