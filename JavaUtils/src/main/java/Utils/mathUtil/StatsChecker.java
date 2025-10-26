package Utils.mathUtil;

import java.util.Arrays;
import java.util.HashMap;

public class StatsChecker {
    //calculates the average of a set of integers
    public static double mean(int... nums){
        if (nums.length == 0) throw new RuntimeException("Length cannot be zero");
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return (double) sum / nums.length;
    }

    //check for the most occurrences of element sent by caller
    public static int mode(int... nums){
        if(nums.length == 0) throw new RuntimeException("Length cannot be zero");
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }
            else{
                map.put(num, map.get(num) + 1);
            }
        }
        int largest = Integer.MIN_VALUE;
        int value =0;
        for(int key : map.keySet()){
            if(map.get(key) > largest){
                largest = map.get(key);
                value = key;
            }
        }
        return value;
    }

    //returns the middle value of a set of numbers
    public static int median(int... nums){
        if(nums.length == 0) throw new RuntimeException("Length cannot be zero");
        Arrays.sort(nums); // important for correct median
        int mid = nums.length / 2;
        if(nums.length % 2 == 0){
            return (nums[mid - 1] + nums[mid]) / 2;
        } else {
            return nums[mid];
        }
    }

}
