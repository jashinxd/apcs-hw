public class Arrays{
    public int[] frontPiece(int[] nums) {
	if (nums.length <= 2){
	    return nums;
	}
	else {
	    int[] finalArray = new int[2];
	    finalArray[0] = nums[0];
	    finalArray[1] = nums[1];
	    return finalArray;
	}
    }
    
    public int sum13(int[] nums) {
	int sum = 0;
	int len = nums.length;
	int i;
	if (len == 0){
	    return sum;
	} else {
	    for (i = 1; i < len; i++){
	if (nums[i] != 13 && nums[i - 1] != 13){
	    sum += nums[i];
	}
	    }
	    if (nums[0] != 13){
		sum += nums[0];
	    }
	    return sum;
	}
    }   
}
