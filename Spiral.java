public class Spiral {
    public static void main(String[] args) {
        int[][] nums = { { 7, 8, 9 } };
        spiralMatrix(nums);
    }

    // spiral matrix
    static void spiralMatrix(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][i] + " ");
            }
            // left
            for (int i = endRow - 1; i > startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
