public class ArmStrongNum {
    public static int count(int n) {

        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static void armStrong(int start, int end) {
        for (int i = start; i <= end; i++) {
            long armNum = 0;
            int c = count(i);
            int key = i;
            while (key > 0) {
                int lastDigit = key % 10;
                armNum = armNum + (int) (Math.pow(lastDigit, c));
                key /= 10;
            }
            if (armNum == i) {
                System.out.print(armNum + " ");
            }
        }
    }

    public static void main(String[] args) {
        armStrong(1, 10000);
    }
}
