import java.util.Arrays;

public class MinPushes {
    public static void main(String args[]) {
        String str = "arpil";
        System.out.println(minimumPushes(str));
    }

    public static int minimumPushes(String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        Arrays.sort(count);
        int ans = 0;
        for (int i = 0; i < count.length; i++) {
            ans = ans + (i / 8 + 1) * count[26 - i - 1];

        }
        return ans;
    }

}
