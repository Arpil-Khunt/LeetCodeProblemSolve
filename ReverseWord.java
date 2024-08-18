public class ReverseWord {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String reverse = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i];
            if (i != 0) {
                reverse += " ";
            }
        }
        return reverse;
    }

    public static void main(String[] args) {
        String s = "The sky is blue";
        System.out.println(reverseWords(s));
    }
}
