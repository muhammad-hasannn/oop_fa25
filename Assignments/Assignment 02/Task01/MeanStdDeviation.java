package Task01;
import java.lang.Math;

public class MeanStdDeviation {

    // method to calculate mean
    public int calMean(int[] nums){
        int mean = 0;

        for(int n : nums){
            mean += n;
        }
        mean /= nums.length;

        return mean;
    }

    // method to calculate variance
    public int calVariance(int[] nums){
        int mean = calMean(nums);
        int variance = 0;

        for(int num : nums) {
            variance += ((num - mean) * (num - mean));
        }
        variance /= nums.length;

        return variance;
    }

    // method to calculate standard deviation
    public int calStdDeviation(int[] nums){
        int var = calVariance(nums);

        int sd = (int)Math.sqrt(var); // typecasting into int, because sqrt() gives ans in double

        return sd;
    }
}