package yuty_test;

import java.util.*;

public class Test {

    public static boolean func(String[] nums){
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(res);
        int cnt = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0){
                cnt++;
            }else {
                if (i!=0 && res[i-1] != 0 && res[i] != res[i-1] + 1){
                    cnt--;
                    if (cnt<0) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] test = {"1", "0", "0", "5", "3"};
//        func(test);
        System.out.println(func(test));
        Collection col = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap();
    }
}
