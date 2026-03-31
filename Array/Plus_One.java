import java.util.Arrays;
class Solution {
    public int[] resarr(int[] digits){
        int k=0,ind=0;
        int n= digits.length;
        int[] arr;
        boolean allNines = Arrays.stream(digits).allMatch(x -> x == 9);
        if(allNines){
            arr=new int[n+1];
            arr[0]=1;
        }else{
            arr=new int[n];
            arr = digits.clone();
            arr[n-1]=digits[n-1]+1;
        }

    return arr;
    }
    public int[] plusOne(int[] digits) {
        return resarr(digits);
    }
}
