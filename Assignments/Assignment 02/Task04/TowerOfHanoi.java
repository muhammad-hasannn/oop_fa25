package Task04;

public class TowerOfHanoi {

    // integer for numbering
    private int sNo = 0;

    // method for tower of hanoi
    public void toh(char a, char b, char c, int n){
        // base case
        if(n == 1){
            System.out.println(++sNo + ". Move from peg " + a + " to " + b + ".");
        }

        // recursive case
        else{
            toh(a, c, b, n-1);
            System.out.println(++sNo + ". Move from peg " + a + " to " + b + ".");
            toh(c, b, a, n-1);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi obj = new TowerOfHanoi();

        obj.toh('A', 'B', 'C', 3);
    }

}
