import java.util.Arrays;

public class SpiralMatrix {

    public static void main(String[] args) {
        int rows = 1, cols = 4, rStart = 0, cStart = 0;
        System.out.println("hello2");
        int[][] ans = spiralMatrixIII(rows, cols, rStart, cStart);
        System.out.println(Arrays.toString(ans));
        System.out.println("hello");
    }

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        result[0] = new int[] { rStart, cStart };
        int count = 1;
        int step = 0;
        int[][] direction = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { -1, 0 } };
        int dir = 0;
        int totalCells = rows * cols;

        while (count < totalCells) {
            if (dir == 0 && dir == 2) {
                step++;
            }
            for (int i = 0; i < step; i++) {
                rStart += direction[dir][0];
                cStart += direction[dir][1];

                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[count++] = new int[] { rStart, cStart };
                }
                if (count == totalCells)
                    return result;
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }
}
