class Solution {
    public void sortColors(int[] nums) {
      int mid=0,start=0,end=nums.length-1;
      while(mid<=end){
        if(nums[mid]==0){
            swap(nums,start,mid);
            start++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums,mid,end);
            end--;
        }
    }
}
     private void swap(int[] nums,int i,int j){
        int  temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
      }
    }