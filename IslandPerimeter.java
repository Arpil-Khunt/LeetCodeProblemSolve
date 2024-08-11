public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
        System.out.println(islandPerimeter(grid));
    }

    // island perimeter
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j, perimeter);
                }
            }
        }
        return -1;
    }

    public static int dfs(int[][] grid, int i, int j, int perimeter) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {

            return ++perimeter;
        }
        if (grid[i][j] == -1) {
            return perimeter;
        }
        grid[i][j] = -1;
        perimeter = dfs(grid, i, j + 1, perimeter);
        perimeter = dfs(grid, i, j - 1, perimeter);
        perimeter = dfs(grid, i + 1, j, perimeter);
        perimeter = dfs(grid, i - 1, j, perimeter);
        return perimeter;
    }
}
