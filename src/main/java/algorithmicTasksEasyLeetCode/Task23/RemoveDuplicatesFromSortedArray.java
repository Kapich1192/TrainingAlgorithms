package algorithmicTasksEasyLeetCode.Task23;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums)+""+Arrays.toString(nums)+" ");
    }
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(list.contains(nums[i])){nums[i]=0;}else list.add(nums[i]);
        }
        nums=new int[nums.length];

        for(int i =0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        Arrays.sort(nums);
        return nums.length-list.size();
    }
}
