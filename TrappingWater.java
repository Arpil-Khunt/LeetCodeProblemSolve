public class TrappingWater {
    public static void main(String args[]) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(trappingWater(height));
    }

    static int trappingWater(int[] height) {
        int[] left = new int[height.length];
        left[0] = height[0];
        int[] right = new int[height.length];
        right[height.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {

            left[i] = Math.max(left[i - 1], height[i]);

        }
        for (int i = height.length - 2; i >= 0; i--) {

            right[i] = Math.max(right[i + 1], height[i]);
        }

        int trapWater = 0;
        for (int i = 0; i < height.length; i++) {
            trapWater = trapWater + (Math.min(left[i], right[i]) - height[i]);
        }

        return trapWater;
    }
}
