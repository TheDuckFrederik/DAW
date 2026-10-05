//
public class Leetcode1 {
    //
    public static void main (String[] args) {
	//
	int[] nums = {2, 7, 11, 13};
	int target = 9;
	//
	//
        int i = 0;
        int n = 0;
        int x = 0;
        int y = 0;
        int numsLen = nums.length;
        boolean found = false;
        int[] result = new int[2];
        //
        while (i < (numsLen - 1) && found == false) {
            n = i + 1;
            x = nums[i];
            y = nums[n];
            //
            while (y != (target - x)) {
        	y = nums[n];
        	//
                if (y == (target - x)) {
                    result[0] = i;
                    result[1] = n;
                    //
                } else {
                    ++n;
                }
                //
            }
            //
            if (result[0] + result[1] == target) {
        	found = true;
            } else {
        	++i;
            }
            //
        }
        //
        System.out.println(result[0] + ", " + result[1]);
        //
    }
    //
}
// Quack
