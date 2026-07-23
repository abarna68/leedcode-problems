class Solution {
    public int removeDuplicates(int[] nums) {
        int k=nums.length;
        int j=1;
        for(int i=1;i<k;i++){
            if(nums[i]!=nums[j-1]){
               nums[j]=nums[i];
               j++;
            }
        }
        return j;
    }
}