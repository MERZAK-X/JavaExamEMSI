import entities.Consumer;
import utils.GenericArrayUtils;
import entities.IFile;
import utils.StringUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //<editor-fold defaultstate="collapsed" desc=" Variables Declaration ">
        final String dummyText = "Lorem ipsum dolor sit amet. Aut rerum 56 internos est laborum 3 similique aut deleniti exercitationem sit nostrum 4%&£3#10$ iure est neque voluptas.";
        final String testString = "ABCDFGHIJKLMNOPQRSTUVWXYZ F TEST";
        Integer[] intArray = new Integer[]{9, 7, 1, 999, 55, 666, 18, 7};
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" Exercise 1 ">
        System.out.println("\nExercise 1 :\n");
        System.out.println(dummyText + "\nSum : " + StringUtils.getSumOfOccurredNumbers(dummyText));
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" Exercise 2 ">
        System.out.println("\nExercise 2 :\n");

        final int occurrencesCount = 8;
        String charsByOccurrences = StringUtils.getCharByOccurrences(dummyText, occurrencesCount);
        System.out.println((charsByOccurrences.length() > 0)
                ? "The characters with " + occurrencesCount + " occurrences are : " + charsByOccurrences
                : "There is no character with " + occurrencesCount + " occurrences !");


        final int impossibleOccurrencesCount = 9999;
        String _charsByOccurrences = StringUtils.getCharByOccurrences(dummyText, impossibleOccurrencesCount);
        System.out.println((_charsByOccurrences.length() > 0)
                ? "The characters with " + impossibleOccurrencesCount + " occurrences are : " + _charsByOccurrences
                : "There is no character with " + impossibleOccurrencesCount + " occurrences !");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" Exercise 3 ">
        System.out.println("\nExercise 3 :\n");

        System.out.println("The first duplicated char in " +
                "\" " + testString + " \" is : " + StringUtils.getFirstDuplicatedChar(testString));
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" Exercise 4 ">
        System.out.println("\nExercise 4 :\n");

        Consumer<Double> consumer = System.out::println; // This is a method reference !
        consumer.accept(5.55D);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" Exercise 5 ">
        IFile<Date> dateIFile = new IFile<Date>() {
            LinkedList<Date> dates = new LinkedList<>();
            @Override
            public void empiler(Date date) {
                dates.add(date);
            }
            @Override
            public Date depiler() {
                return dates.removeFirst();
            }
        };
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" Exercise 6 ">
        System.out.println("\nExercise 6 :\n");

        GenericArrayUtils.sortArray(intArray);
        Arrays.stream(intArray).forEach(x -> System.out.print(x + " ")); // System.out::println
        System.out.println();
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" Exercise 7 ">
        System.out.println("\nExercise 7 :\n");

        System.out.println(GenericArrayUtils.getElementByIndex(Arrays.asList(intArray), 5));
        //</editor-fold>

    }
}
