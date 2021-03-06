class Main {

    public static void main(String[] args) {
        removeDuplicates(new int[]{0, 1, 0, 3, 12});
    }

    public static int removeDuplicates(int[] nums) {
        int writePoint = 0;
        int zeroPoint = 0;
        for(int readPoint = 0; readPoint < nums.length; readPoint++) {
            if(nums[readPoint] != 0) {
                nums[writePoint] = readPoint;
                writePoint++;
            } else {
                zeroPoint++;
            }
        }

        for(int i = nums.length-1; i > 0; i--) {
            if(zeroPoint == 0) break;
            nums[i] = 0;
            zeroPoint--;
        }

        return zeroPoint;
    }
}