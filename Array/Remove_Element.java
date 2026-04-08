class Solution {
    public int newNum(int[] nums, int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            } else { continue; }
        }
        return k;
    }
    public int removeElement(int[] nums, int val) {
        return newNum(nums,val);
    }
}
