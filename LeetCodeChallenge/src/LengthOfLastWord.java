import java.util.Arrays;

public class LengthOfLastWord {
    public int lengthofword(String s){
        String[] stringToArray = s.split(" ");

        return  stringToArray[stringToArray.length-1].length();

    }
}
