class Solution {
    public boolean checkPal(int x){
        int curr=x;
        int revNum=0;
        while(x!=0){
            revNum = revNum*10 + x%10;
            x/=10;
        }
        if(curr<0){
            return false;
        }
        return revNum==curr;
    }
    public boolean isPalindrome(int x) {
        return checkPal(x);
    }
}
