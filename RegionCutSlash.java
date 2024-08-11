public class RegionCutBySlash {
  public static void main(String[] args) {
    String[] grid = { " /", "/ " };
    System.out.println(regionCutBySlash(grid));
  }

  // find the number of regions
  public static int regionCutBySlash(String[] grid) {
    int rows = grid.length;
    int cols = grid[0].length();
    int[][] matrix = new int[rows * 3][cols * 3];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i].charAt(j) == '/') {
          matrix[i * 3][j * 3 + 2] = 1;
          matrix[i * 3 + 1][j * 3 + 1] = 1;
          matrix[i * 3 + 2][j * 3] = 1;
        } else if (grid[i].charAt(j) == '\\') {
          matrix[i * 3][j * 3] = 1;
          matrix[i * 3 + 1][j * 3 + 1] = 1;
          matrix[i * 3 + 2][j * 3 + 2] = 1;
        }
      }
    }
    int region = 0;

    for (int i = 0; i < rows * 3; i++) {
      for (int j = 0; j < cols * 3; j++) {
        region += solveDFS(matrix, i, j) > 0 ? 1 : 0;
      }
    }
    return region;

  }

  private static int solveDFS(int[][] dp, int i, int j) {
    // edge
    if (Math.min(i, j) < 0 || Math.max(i, j) >= dp.length || dp[i][j] != 0) {
      return 0;
    }

    dp[i][j] = 1;
    return (1 + solveDFS(dp, i, j + 1) + solveDFS(dp, i, j - 1)
        + solveDFS(dp, i + 1, j) + solveDFS(dp, i - 1, j));
  }
}