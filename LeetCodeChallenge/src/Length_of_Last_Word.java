public class Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));

    }
    public static int lengthOfLastWord(String s) {

//          Input: s = "Hello World"
//          Output: 5

        String trimmed = s.trim();
        int n = trimmed.length()-1;
        int counter = 0;
        for (int i = n; trimmed.charAt(i) != ' '; i--){
            counter++;
        }
        return counter;

    }
}
