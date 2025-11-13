package Task02;
import java.util.Random;

public class RandomCharacter {

    // method to generate random numbers (ascii code)
    public static int[] generateRandom(){
        Random rand = new Random();

        int[] nums = new int[175];

        // generating 175 random ascii codes
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(33, 126);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = generateRandom();

        // typecasting them into chars
        char[] chars = new char[175];
        for(int i = 0; i < 175; i++){
            chars[i] = (char)nums[i];
        }

        // displaying them
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i] + " ");

            if((i+1) % 25 == 0){
                System.out.println();
            }
        }

    }
}