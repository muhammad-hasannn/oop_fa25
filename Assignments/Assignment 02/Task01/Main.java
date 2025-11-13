package Task01;
import java.util.Random;

public class Main {

    // method to generate 10 random numbers
    public static int[] generateRandom(){
        Random rand = new Random();
        int[] nums = new int[10];

        // generating random nums
//        for(int n : nums){
//            n = rand.nextInt(100);
//        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(100);
        }

        return nums;
    }

    public static void main(String[] args) {
        MeanStdDeviation obj = new MeanStdDeviation();
        int[] nums = generateRandom();

        System.out.print("Generated random numbers are: ");
        for(int n : nums){
            System.out.print(n + " ");
        }

        System.out.println("\n\nMean is: " + obj.calMean(nums));
        System.out.println("Standard deviation is: " + obj.calStdDeviation(nums));

    }
}
