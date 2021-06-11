package utils;

public class StringUtils {
    public static int getOccurrencesCount(String text, char c){
        return ((text.length()) - (text.replaceAll(c +"","").length()));
    }

    public static int getSumOfOccurredNumbers(String text){
        String[] numbers = (text.trim()).split("\\D+");
        int sum = 0;
        for (String number : numbers)
            sum += number.isEmpty() ? 0 : Integer.parseInt(number.trim());
        return sum;
    }

    public static String getCharByOccurrences(String text, int occurrencesCount){
        StringBuilder occurredChars = new StringBuilder();

        for (char c : text.toCharArray()){
            if (getOccurrencesCount(text,c) == occurrencesCount)
                if (!occurredChars.toString().contains(c+""))
                    occurredChars.append(c).append(" ");
        }

        return (occurredChars.length() > 0) ? occurredChars.toString() : "";
    }

    public static char getFirstDuplicatedChar(String text){
        for (char c : text.toCharArray())
            if (getOccurrencesCount(text,c) > 1) return c;
        return '\0';
    }

}
